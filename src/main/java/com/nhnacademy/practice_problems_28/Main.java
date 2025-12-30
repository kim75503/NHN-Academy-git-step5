package com.nhnacademy.practice_problems_28;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 28: 리스트가 비어있으면 "목록이 비어있습니다"를 출력하고, 아니면 모든 항목을 출력하는 코드를 작성하세요.

        ArrayList<String> items = new ArrayList<>();
        // 여기에 코드 작성
         */
        ArrayList<String> items = new ArrayList<>();

        if(items.isEmpty()){
            System.out.println("목록이 비어있습니다");
        }else{
            for(String It: items){
                System.out.println(It);
            }
        }
    }
}
