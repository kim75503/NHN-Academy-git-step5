package com.nhnacademy.practice_problems_7;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 7: 배열 {10, 20, 30, 40, 50}의 모든 숫자 합계를 for-each문을 사용하여 구하는 프로그램을 작성하세요.

        출력 결과:

        합계: 150

         */

        int[] Num = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int num : Num){
            sum += num;
        }
        System.out.println("합계: " + sum);
    }
}
