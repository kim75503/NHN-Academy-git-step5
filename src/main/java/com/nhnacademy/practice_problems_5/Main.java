package com.nhnacademy.practice_problems_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException{
     /*
     문제 5: 단(2~9)을 입력받아 해당 구구단을 출력하는 프로그램을 작성하세요.

        실행 예:

        단 입력: 7
        7 x 1 = 7
        7 x 2 = 14
        7 x 3 = 21
        7 x 4 = 28
        7 x 5 = 35
        7 x 6 = 42
        7 x 7 = 49
        7 x 8 = 56
        7 x 9 = 63
      */   

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("단 입력: ");
        int Num = Integer.parseInt(reader.readLine());

        for(int i = 1; i < 10; i++){
            System.out.println(Num + " x "+ i +" = " + Num*i);
        }



    }
}
