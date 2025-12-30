package com.nhnacademy.practice_problems_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        /*
        ####문제 32: BufferedReader로 2개의 TODO 정보(할 일, 예상 시간)를 입력받아 ArrayList에 저장하고, 
        번호와 함께 출력하는 프로그램을 작성하세요.

        실행 예:

        할 일: Java 공부
        예상 시간(시): 3
        할 일: 운동하기
        예상 시간(시): 1

        === TODO 목록 ===
        1. Java 공부 (3시간)
        2. 운동하기 (1시간)
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Todo> todo = new ArrayList<>();

        String task;
        int hour;

        for(int i = 0 ; i < 2 ; i ++){
        System.out.print("할 일: ");
        task = reader.readLine();
        System.out.print("예상 시간(시): ");
        hour = Integer.parseInt(reader.readLine());

        todo.add(new Todo(task, hour));
        
        }
        int cunt =0;
        System.out.println("=== TODO 목록 ===");
        for(Todo Td : todo){
            cunt++;
            System.out.println(cunt+". "+Td.task +" ("+Td.hour+"시간)");
        }


        


    }
}

class Todo{
    String task;
    int hour;

    Todo(String task, int hour){
        this.task = task;
        this.hour = hour;
    }
}
