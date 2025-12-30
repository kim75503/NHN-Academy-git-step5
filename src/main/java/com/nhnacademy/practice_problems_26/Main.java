package com.nhnacademy.practice_problems_26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 26: index 기반 for 문을 사용하여 번호와 함께 이름을 출력하세요.

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // index 기반 for 문으로 출력
        // 출력 형식: 1. Alice
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for(int i = 0; i < names.size(); i++){
            System.out.println(i+1 +". " + names.get(i));
        }
    }
}
