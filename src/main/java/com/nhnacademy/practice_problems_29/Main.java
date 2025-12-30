package com.nhnacademy.practice_problems_29;

public class Main {
    public static void main(String[] args) {
        /*
        ###연습: 타입 변환 (입력 처리)
        ####문제 29: 문자열 "42"를 정수로 변환한 후 10을 더해서 출력하는 프로그램을 작성하세요.

        출력 결과:

        52
         */
        int num = Integer.parseInt("42") +10;

        System.out.println(num);
    }
}
