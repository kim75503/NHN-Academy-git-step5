package com.nhnacademy.practice_problems_15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 15: 인덱스가 필요한 경우 어떤 반복문을 사용해야 할까요? 번호와 함께 출력하세요.

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("아침 운동");
        tasks.add("이메일 확인");
        tasks.add("회의 참석");

        // "1. 아침 운동" 형태로 출력하는 코드 작성
         */

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("아침 운동");
        tasks.add("이메일 확인");
        tasks.add("회의 참석");

        for(int i = 1 ; i <= tasks.size(); i++){
            System.out.println( "\"" + i + ". " + tasks.get(i-1) + "\"");
        }
    }
}
