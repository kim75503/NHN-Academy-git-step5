package com.nhnacademy.practice_problems_21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ###연습: ArrayList 사용
        ####문제 21: String을 저장하는 ArrayList를 선언하고, "홍길동"과 "김철수"를 추가한 후 전체 개수를 출력하는 프로그램을 작성하세요.

        출력 결과:

        개수: 2
         */

        ArrayList<String> name = new ArrayList<>();

        name.add("홍길동");
        name.add("김철수");

        System.out.println("개수: " + name.size());

    }
}
