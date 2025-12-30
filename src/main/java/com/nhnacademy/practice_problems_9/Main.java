package com.nhnacademy.practice_problems_9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 9: for-each문을 사용하여 Todo 목록에서 완료된 항목만 출력하세요.

        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("공부", 3, false));
        todoList.add(new Todo("운동", 1, true));
        todoList.add(new Todo("독서", 2, false));
        todoList.add(new Todo("청소", 1, true));

        // 완료된 항목만 출력하는 코드 작성
         */
        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("공부", 3, false));
        todoList.add(new Todo("운동", 1, true));
        todoList.add(new Todo("독서", 2, false));
        todoList.add(new Todo("청소", 1, true));

        for(Todo todo : todoList){
            if(todo.doit)
                System.out.println(todo.task);
        }
    }

}

class Todo{

    String task;
    int num;
    boolean doit;
    
    
    Todo(String task, int num, boolean doit){
        this.task = task;
        this.num = num;
        this.doit = doit;
    }

}