package com.nhnacademy.practice_problems_17;

public class Main {
    public static void main(String[] args) {
        /*
        ###연습: 배열 (Array) 기초
        ####문제 17: 크기가 3인 String 배열을 선언하고, "홍길동", "김철수", "이영희"를 저장한 후, 
        배열 길이와 첫 번째 요소를 출력하는 프로그램을 작성하세요.

        출력 결과:

        배열 길이: 3
        첫 번째: 홍길동
         */

        String[] name = new String[3];
        name[0] = "홍길동";
        name[1] = "김철수";
        name[2] = "이영희";

        System.out.println("배열 길이: " + name.length);
        System.out.println("첫 번째: " +name[0]);
        

        


    }
}
