package com.nhnacademy.practice_problems_6;

public class Main {
    public static void main(String[] args) {
        /*
        ###연습: for-each문
        ####문제 6: 문자열 배열 {"사과", "바나나", "오렌지"}의 모든 요소를 for-each문을 사용하여 출력하는 프로그램을 작성하세요.

        출력 결과:

        사과
        바나나
        오렌지
         */

        String[] pName = {"사과", "바나나", "오렌지"};

        for(String name : pName){
            System.out.println(name);
        }
    }
}
