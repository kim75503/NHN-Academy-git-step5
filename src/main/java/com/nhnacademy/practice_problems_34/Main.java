package com.nhnacademy.practice_problems_34;


public class Main {
    public static void main(String[] args) {
        /*
        문제 34: 배열을 사용하여 간단한 SimpleArrayList 클래스를 직접 구현하세요.

        요구사항:

        내부적으로 String[] 배열 사용 (초기 크기 2)
        add(String item) - 요소 추가 (배열이 가득 차면 2배로 확장)
        get(int index) - 인덱스로 요소 조회
        size() - 저장된 요소 개수 반환
        isEmpty() - 비어있는지 확인

        테스트 코드:

        public class Main {
            public static void main(String[] args) {
                SimpleArrayList list = new SimpleArrayList();

                System.out.println("비어있음: " + list.isEmpty());  // true
                System.out.println("크기: " + list.size());         // 0

                list.add("Java");
                list.add("Python");
                System.out.println("크기: " + list.size());         // 2

                // 초기 용량(2)을 초과하여 추가 - 배열 확장 발생
                list.add("JavaScript");
                list.add("C++");
                list.add("Go");

                System.out.println("비어있음: " + list.isEmpty());  // false
                System.out.println("크기: " + list.size());         // 5
                System.out.println("첫 번째: " + list.get(0));      // Java
                System.out.println("다섯 번째: " + list.get(4));    // Go
            }
        }
        */
        SimpleArrayList list = new SimpleArrayList();

                System.out.println("비어있음: " + list.isEmpty());  // true
                System.out.println("크기: " + list.size());         // 0

                list.add("Java");
                list.add("Python");
                System.out.println("크기: " + list.size());         // 2

                // 초기 용량(2)을 초과하여 추가 - 배열 확장 발생
                list.add("JavaScript");
                list.add("C++");
                list.add("Go");

                System.out.println("비어있음: " + list.isEmpty());  // false
                System.out.println("크기: " + list.size());         // 5
                System.out.println("첫 번째: " + list.get(0));      // Java
                System.out.println("다섯 번째: " + list.get(4));    // Go

    }
}

class SimpleArrayList{
    int Count = 0;
    String[] Array = new String[2];


    public void add(String item){
        
       
        if(Count == Array.length){
            String[] Brray = new String[Array.length];
            for(int i = 0 ; i <Array.length; i++){
                Brray[i] = Array[i];
            }
            Array = new String[Array.length*2];
            for(int i = 0 ; i <Brray.length; i++){
                Array[i] = Brray[i];
            }
        }
         this.Array[Count] = item;
        Count++;
    }

    public String get(int index){
        
        return Array[index];
    }

    public int size(){
        return Count;
    }

    public boolean isEmpty(){
        if(Count == 0)
            return true;
        else 
            return false;
    }
}
