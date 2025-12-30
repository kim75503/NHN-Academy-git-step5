package com.nhnacademy.practice_problems_13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 13: ArrayList에 "Python", "Java", "JavaScript"를 추가한 후, "Java"를 찾으면 "찾았습니다!"를 출력하고 검색을 중단하는 프로그램을 작성하세요. break를 사용하세요.

        출력 결과:

        검색 중: Python
        찾았습니다!
         */

        ArrayList<String> name = new ArrayList<>();

        name.add("Python");
        name.add("Java");
        name.add("JavaScript");

        for(String Name : name){
            
            if(Name.equals("Java")){
                System.out.println("찾았습니다!");
                break;
            }
            System.out.println("검색 중: " + Name);
        }
    }  
}
