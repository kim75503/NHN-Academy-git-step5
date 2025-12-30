package com.nhnacademy.practice_problems_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        /*
        ####문제 2: 두 수를 입력 받아 두 수 사이의 정수 합을 구하세요.

        출력 결과:

        시작: 1 
        끝: 10
        합계: 55
        시작: 10
        끝: 1
        첫 번째 숫자는 두 번째 숫자보다 작거나 같아야 합니다.
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("시작: ");
        int startNum = Integer.parseInt(reader.readLine());
        System.out.print("끝: ");
        int endNum = Integer.parseInt(reader.readLine());

        if(startNum > endNum){
            System.out.println("첫 번째 숫자는 두 번째 숫자보다 작거나 같아야 합니다.");
            return ;
        }

        int sum = 0;
        for(int i = startNum; i<= endNum; i++){
            sum += i;
        }
        System.out.println("합계: " + sum);
    }
}
