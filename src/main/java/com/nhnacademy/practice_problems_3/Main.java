package com.nhnacademy.practice_problems_3;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 3: 10부터 2까지 짝수만 역순으로 출력하는 프로그램을 작성하세요. (2씩 감소하는 for문 사용)

        출력 결과:

        10 8 6 4 2
         */

        for(int i = 10; i >1; i-= 2)
                System.out.print(i+ " ");
        
    }
}
