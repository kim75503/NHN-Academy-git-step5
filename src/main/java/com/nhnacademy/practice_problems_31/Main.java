package com.nhnacademy.practice_problems_31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ###종합 연습
        ####문제 31: 다음 요구사항을 만족하는 코드를 작성하세요.

        Product 클래스 정의 (필드: name, price)
        ArrayList<Product>에 3개의 상품 추가
        전체 상품 목록 출력 (번호 포함)
         */

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("핸드폰", 100));
        products.add(new Product("노트북", 200));
        products.add(new Product("컴퓨터", 300));
        int cunt = 0;
        for(Product pd : products){
            cunt++;
            System.out.println(cunt +". "+pd.name + " - " + pd.price+"원");
        }

    }
}

class Product{

    String name;
    int price;
    
    Product(String name, int price){
        this.name= name;
        this.price = price;
    }
}