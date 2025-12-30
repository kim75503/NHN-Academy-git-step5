package com.nhnacademy.practice_problems_12;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 12: 1부터 10까지의 숫자 중 홀수만 출력하는 프로그램을 continue를 사용하여 작성하세요.

        출력 결과:

        1 3 5 7 9
         */
        
        for(int i = 1; i < 10; i++){
            if(i %2 == 1)
                System.out.print(i + " ");

        }
    }  
}
