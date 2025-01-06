package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반복문 실행
        boolean flag = true; // while 문 조건 flag

        while (flag){
            int firstNum, secondNum;

            // 첫번째 숫자 입력받기
            while (true){
                // 양의 정수(0 포함)를 입력 받기
                System.out.print("첫 번째 숫자를 입력하세요: ");
                firstNum = sc.nextInt();

                // 양의 정수가 아니라면 continue
                if (firstNum >= 0){
                    break;
                }
                else {
                    System.out.println("양의 정수를 입력해주세요.");
                }
            }

            // 두번째 숫자 입력받기
            while (true){
                // 양의 정수(0 포함)를 입력 받기
                System.out.print("두 번째 숫자를 입력하세요: ");
                secondNum = sc.nextInt();

                // 양의 정수가 아니라면 continue
                if (secondNum >= 0){
                    break;
                }
                else {
                    System.out.println("양의 정수를 입력해주세요.");
                }
            }

            // 사칙연산 기호 유효성 체크
            char operator;
            while (true){
                System.out.print("사칙연산 기호를 입력하세요: ");
                operator = sc.next().charAt(0);

                if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                    break;
                }
                else{
                    System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
                }
            }

            // 연산 수행하기
            int result = 0; // 연산 결과 값 저장 변수
            boolean validOperation = true; // 사칙 연산 수행 실패 시 결과를 출력하지 않도록 설정하는 변수

            switch (operator){
                case '+': result = firstNum + secondNum;
                    break;
                case '-': result = firstNum - secondNum;
                    break;
                case '*': result = firstNum * secondNum;
                    break;
                case '/':
                    if(secondNum == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        validOperation = false;
                    } else {
                        result = firstNum / secondNum;
                    }
                    break;
            }

            // 연산 결과 출력하기
            if(validOperation){
                System.out.println("결과: " + result);
            }

            // 반복 여부 확인하기
            System.out.println("더 계산하시겠습니까? 아무 키나 입력해주세요. (exit 입력 시 종료)");

            // 버퍼 정리
            sc.nextLine(); // 이전 입력으로 남아 있는 줄바꿈 문자를 제거

            String continueText = sc.nextLine();
            if (continueText.equals("exit")){
                flag = false;
            }
        }
    }
}
