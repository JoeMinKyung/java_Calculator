package com.example.calculator;

import java.util.ArrayList;


public class Calculator2 {
    // 연산 결과를 저장할 컬렉션
    private final ArrayList<Integer> results;

    // 생성자
    public Calculator2() {
        results = new ArrayList<>();
    }

    public int calculate(int a, int b, char c){
        int result = 0; // calculate 수행 결과 값 저장

        // 연산 수행하기
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    result = -1;
                } else {
                    result = a / b;
                }
                break;
        }
        // 연산 결과를 저장
        results.add(result);
        return result;
    }
}
