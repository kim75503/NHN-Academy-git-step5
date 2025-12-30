package com.nhnacademy.practice_problems_27;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    /*
    ####문제 27: Todo ArrayList에 "Java"(3시간, 미완료)와 "Spring"(5시간, 완료)을 추가하고, 각 항목의 제목과 상태를 출력하는 프로그램을 작성하세요. 삼항 연산자를 사용하여 상태를 표시하세요.

        출력 결과:

        Java - 미완료
        Spring - 완료
     */ 

    ArrayList<Todo> todo = new ArrayList<>();
    todo.add(new Todo("Java", 3,false));
    todo.add(new Todo("Spring", 5,true));
    

    for(Todo t : todo){
        String status = t.isDoit ? "완료" : "미완료";
        System.out.println(t.name + " - " + status);
    }
    
    
        
    }
}

class Todo{

    String name;
    int hour;
    boolean isDoit;

    Todo(String name, int hour, boolean isDoit){
        this.name= name;
        this.hour = hour;
        this.isDoit = isDoit;
    }
}