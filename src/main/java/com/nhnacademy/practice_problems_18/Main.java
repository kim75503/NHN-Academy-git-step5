package com.nhnacademy.practice_problems_18;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 18: 정수 배열 {90, 85, 78, 92}를 선언하고, 배열의 길이, 첫 번째 요소, 마지막 요소를 출력하는 프로그램을 작성하세요.

        출력 결과:

        배열 길이: 4
        첫 번째: 90
        마지막: 92
         */

        int[] Num = {90, 85, 78, 92};
        System.out.println("배열 길이: " + Num.length);
        System.out.println("첫 번째: " +Num[0]);
        System.out.println("마지막: " +Num[Num.length-1]);
        
    }
}
