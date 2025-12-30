package com.nhnacademy.practice_problems_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 8: ArrayList에 "Alice", "Bob", "Charlie"를 추가하고, for-each문으로 각 이름에 인사하는 프로그램을 작성하세요.

        출력 결과:

        Hello, Alice!
        Hello, Bob!
        Hello, Charlie!

         */

        ArrayList<String> hello = new ArrayList<>();

        hello.add("Alice");
        hello.add("Bob");
        hello.add("Charlie");

        for(String name : hello){
            System.out.println("Hello, "+ name +"!");
        }
    }
}
