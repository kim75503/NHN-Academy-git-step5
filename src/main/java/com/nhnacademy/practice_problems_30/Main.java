package com.nhnacademy.practice_problems_30;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 30: 문자열 "true", "false", "TRUE", "yes"를 각각 Boolean.parseBoolean()으로 변환하여 결과를 출력하는 프로그램을 작성하세요. Boolean.parseBoolean()의 특징을 확인해보세요.

        출력 결과:

        "true" -> true
        "false" -> false
        "TRUE" -> true
        "yes" -> false

         */

        boolean isdo = Boolean.parseBoolean("true");
        System.out.println(isdo);
         isdo = Boolean.parseBoolean("false");
         System.out.println(isdo);
         isdo = Boolean.parseBoolean("TRUE");
         System.out.println(isdo);
         isdo = Boolean.parseBoolean("yes");
         System.out.println(isdo);

         /*
         설명:
            Boolean.parseBoolean()은 대소문자 구분 없이 "true"일 때만 true 반환
            그 외의 모든 값("yes", "1", "Y" 등)은 false 반환

          */

    }
}
