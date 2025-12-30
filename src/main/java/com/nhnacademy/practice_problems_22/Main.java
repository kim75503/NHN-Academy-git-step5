package com.nhnacademy.practice_problems_22;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 22: Integer ArrayList에 10, 20, 30을 추가하고, 첫 번째 요소, 마지막 요소, 전체 개수를 출력하는 프로그램을 작성하세요. get()과 size() 메서드를 사용하세요.

        출력 결과:

        첫 번째: 10
        마지막: 30
        전체 개수: 3
         */

        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);

        
        System.out.println("첫 번째: " +num.get(0));
        System.out.println("마지막: " +num.get(num.size()-1));
        System.out.println("전체 개수: " + num.size());

        

    }
}
