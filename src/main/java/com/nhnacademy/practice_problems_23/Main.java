package com.nhnacademy.practice_problems_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        /*
        ####문제 23: 간단한 대기열(큐) 프로그램을 작성하세요.

        요구사항:

        0을 입력하면 이름을 입력받아 ArrayList에 추가 (입장)
        1을 입력하면 제일 앞에 있는 사람을 제거하고 출력 (퇴장)
        ArrayList가 비어있으면 "대기열이 비어있습니다" 출력
        2를 입력하면 종료
        실행 예:

        메뉴: 0.입장 1.퇴장 2.종료
        선택: 0
        이름: 홍길동
        홍길동 입장

        메뉴: 0.입장 1.퇴장 2.종료
        선택: 0
        이름: 김철수
        김철수 입장

        메뉴: 0.입장 1.퇴장 2.종료
        선택: 1
        홍길동 퇴장

        메뉴: 0.입장 1.퇴장 2.종료
        선택: 1
        김철수 퇴장

        메뉴: 0.입장 1.퇴장 2.종료
        선택: 1
        대기열이 비어있습니다

        메뉴: 0.입장 1.퇴장 2.종료
        선택: 2
        종료합니다.
         */

        ArrayList<String> name = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean stopped =true;

        String userName;
        while(stopped){
            System.out.println("메뉴: 0.입장 1.퇴장 2.종료");
            System.out.print("선택: ");
            int sel = Integer.parseInt(reader.readLine());
            
            switch(sel){
                case 0 : {
                    System.out.print("이름: ");
                    userName = reader.readLine();
                    name.add(userName);
                    System.out.println(userName +" 입장");
                    break;}
                case 1 : {
                    if(name.isEmpty()){
                        System.out.println("대기열이 비어있습니다");
                        break;
                    } 
                    
                    System.out.println(name.get(0)+" 퇴장");
                    name.remove(0);
                    break;
                }
                case 2 : {
                    System.out.println("종료합니다.");
                    stopped = false;
                    break;
                }
                    
            }
            System.out.println();
        }
        
            


    }
}
