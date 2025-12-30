package com.nhnacademy.practice_problems_24;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 24: Todo 오브젝트를 저장하는 ArrayList를 선언하고, 두 개의 Todo를 추가한 후 전체 개수를 출력하세요.
         */

        ArrayList<Todo> todo = new ArrayList<>();

        todo.add(new Todo());
        todo.add(new Todo());

        System.out.println("개수: " + todo.size());
    }
}

class Todo{

}