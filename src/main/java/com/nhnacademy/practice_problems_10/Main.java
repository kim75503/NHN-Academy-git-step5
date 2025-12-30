package com.nhnacademy.practice_problems_10;

public class Main {
    public static void main(String[] args) {
        /*
        ###연습: break와 continue
        ####문제 10: 1부터 10까지 반복하면서 5가 되면 반복을 중단하는 프로그램을 break를 사용하여 작성하세요.

        출력 결과:

        1 2 3 4
         */

        for(int i = 1; i <= 10; i++){
            if(i == 5 )
                break;
            System.out.print( i+ " ");
            
        }
    }
}
