package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 양의 정수 2개(0 포함)를 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();

        // 사칙연산 기호를 입력 받기
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);

        // 연산 수행하기
        int result = 0; // 연산 결과 값 저장 변수
        switch (operator){
            case '+': result = firstNum + secondNum;
            break;
            case '-': result = firstNum - secondNum;
            break;
            case '*': result = firstNum * secondNum;
            break;
            case '/': result = firstNum / secondNum;
            break;
            default:
                System.out.println("잘못된 사칙연산 기호입니다.");
        }

        // 연산 결과 출력하기
        System.out.println("결과: " + result);
    }
}
