package com.nhnacademy.practice_problems_16;

public class Main {
    public static void main(String[] args) {
        /*
        ####문제 16: 역순으로 출력해야 할 때 어떤 반복문을 사용해야 할까요?

        int[] numbers = {1, 2, 3, 4, 5};

        // 5, 4, 3, 2, 1 순서로 출력하는 코드 작성
         */
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = numbers.length; i >0; i--){
            System.out.print(numbers[i-1] + " ");
        }
    }
}
