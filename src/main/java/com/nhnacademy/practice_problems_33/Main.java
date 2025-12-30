package com.nhnacademy.practice_problems_33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        ####문제 33: 메뉴를 통해 TODO를 등록(1번)하고 조회(2번)하는 프로그램을 작성하세요. switch문을 사용하여 메뉴 선택을 처리하세요.

        실행 예:

        메뉴: 1.등록 2.조회 0.종료
        선택: 1
        할 일: Java 공부
        시간: 3
        등록 완료!

        메뉴: 1.등록 2.조회 0.종료
        선택: 2
        === TODO 목록 ===
        1. [미완료] Java 공부
         */

        ArrayList<Todo> todo = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stopped =true, isDoen;

        String task, doit;
        int hour;


        while(stopped){
            System.out.println("메뉴: 1.등록 2.조회 0. 종료");
            System.out.print("선택: ");
            int sel = Integer.parseInt(reader.readLine());
            
            switch(sel){
                case 1 : {
                    System.out.print("할 일: ");
                     task = reader.readLine();
                    System.out.print("시간: ");
                     hour = Integer.parseInt(reader.readLine());
                     todo.add(new Todo(task, hour));
                     System.out.println("등록 완료!");
                    break;}
                case 2 : {
                    if(todo.isEmpty()){
                        System.out.println("대기열이 비어있습니다");
                        break;
                    } 
                    
                    System.out.println("=== TODO 목록 ===");
                    for(int i = 0 ; i< todo.size(); i++){
                        isDoen = todo.get(i).isDone;
                        if(isDoen)
                            doit = "완료";
                        else
                            doit = "미완료";
                        System.out.println(i+1 + ". [" + doit+"] "+todo.get(i).task);
                    }
                    break;
                }
                case 0 : {
                    System.out.println("종료합니다.");
                    stopped = false;
                    break;
                }
                    
            }
            System.out.println();
        }
    }
}

class Todo{
    String task;
    int hour;
    boolean isDone = false;

    Todo(String task, int hour){
        this.task = task;
        this.hour = hour;
    }
}