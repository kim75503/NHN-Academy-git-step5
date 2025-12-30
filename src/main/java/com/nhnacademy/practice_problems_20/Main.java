package com.nhnacademy.practice_problems_20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 20: 다음 코드는 4번째 요소를 저장할 때 예외가 발생합니다. 문제점을 찾고 ArrayList를 사용하여 해결하세요.

        public class Main {
            public static void main(String[] args) {
                // 최대 3개까지만 저장 가능
                String[] todoArray = new String[3];
                int count = 0;

                // 3개 저장 - 정상
                todoArray[count++] = "Java 공부";
                todoArray[count++] = "운동하기";
                todoArray[count++] = "독서";

                // 4번째 저장 시도 - 예외 발생!
                todoArray[count++] = "영화 보기";

             System.out.println("저장된 TODO: " + count + "개");
            }
        }
        */
        ArrayList<String> todoArray = new ArrayList<>();

        todoArray.add("Java 공부");
        todoArray.add("운동하기");
        todoArray.add("독서");
        todoArray.add("영화 보기");

        System.out.println("저장된 TODO: " + todoArray.size() + "개");

    }
}
