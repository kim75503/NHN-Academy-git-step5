package com.nhnacademy.practice_problems_14;

public class Main {

    public static void main(String[] args) {
        /*
        ###연습: for문과 for-each 비교
        ####문제 14: 배열 {"빨강", "파랑", "노랑"}의 모든 요소를 출력하는 프로그램을 기본 for문과 for-each문 두 가지 방식으로 작성하세요.

        출력 결과 (둘 다 동일):

        빨강
        파랑
        노랑
         */

        String color[] = {"빨강", "파랑", "노랑"};

        for(String Col : color){
            System.err.println(Col);
        }

        for(int i= 0 ; i < color.length; i++){
            System.out.println(color[i]);
        }
    }
}
