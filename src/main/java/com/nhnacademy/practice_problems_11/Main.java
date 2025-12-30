package com.nhnacademy.practice_problems_11;



public class Main {
    public static void main(String[] args) {
        /*
        ####문제 11: 1부터 10까지 반복하면서 5만 건너뛰고 나머지를 출력하는 프로그램을 continue를 사용하여 작성하세요.

        출력 결과:

        1 2 3 4 6 7 8 9 10
         */
        for(int i = 1; i <= 10; i++){
            if(i == 5 )
                continue;;
            System.out.print( i+ " ");
            
        }
    
    }
}
