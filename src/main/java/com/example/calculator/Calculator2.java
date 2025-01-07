package com.example.calculator;

public class Calculator2 {
    int result; // calculate 수행 결과 값 저장

    public int calculate(int a, int b, char c){
        // 연산 수행하기
        boolean validOperation = true; // 사칙 연산 수행 실패 시 결과를 출력하지 않도록 설정하는 변수

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
        return result;
    }
}
