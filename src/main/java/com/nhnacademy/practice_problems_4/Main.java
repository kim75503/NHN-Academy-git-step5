package com.nhnacademy.practice_problems_4;


public class Main {
    public static void main(String[] args) {
        /*
        ####문제 4: 1부터 100까지의 정수 중 3의 배수의 합을 구하는 프로그램을 작성하세요.

        출력 결과:

        3의 배수의 합: 1683

         */
        int sum =0 ;
        for(int i = 3; i <= 100; i += 3){
            sum+= i;
        }

        System.out.println("3의 배수의 합: " + sum);
    }
}
