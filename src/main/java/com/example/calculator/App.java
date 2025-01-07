package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator2 calc = new Calculator2();

        // 반복문 실행
        boolean flag = true; // while 문 조건 flag

        while (flag) {
            int firstNum, secondNum;
            char operator;

            // 첫번째 숫자 입력받기
            firstNum = getPositiveInteger(sc, "첫 번째 숫자를 입력하세요: ");

            // 두번째 숫자 입력받기
            secondNum = getPositiveInteger(sc, "두 번째 숫자를 입력하세요: ");

            // 사칙연산 기호 입력받기
            operator = getOperator(sc);

            // 연산 수행하기
            int result = calc.calculate(firstNum, secondNum, operator);

            // 연산 결과 출력하기
            if (result != -1) {
                System.out.println("결과: " + result);
            }

            // 반복 여부 확인하기
            System.out.println("더 계산하시겠습니까? 아무 키나 입력해주세요. (exit 입력 시 종료)");

            // 버퍼 정리
            sc.nextLine(); // 이전 입력으로 남아 있는 줄바꿈 문자를 제거

            String continueText = sc.nextLine();
            if (continueText.equals("exit")) {
                flag = false;
            }
        }
    }

    // 양의 정수 입력받는 메서드
    private static int getPositiveInteger(Scanner sc, String prompt) {
        int number;
        while (true) {
            System.out.print(prompt);
            String input = sc.next();

            // 정수 입력 확인
            try {
                number = Integer.parseInt(input); // 문자열을 정수로 변환
                // 양의 정수 입력 확인
                if (number >= 0) {
                    return number; // 양의 정수이면 반복 종료
                } else {
                    System.out.println("0 이상의 정수를 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("유효한 정수를 입력해주세요.");
            }
        }
    }

    // 연산자 입력받는 메서드
    private static char getOperator(Scanner sc) {
        char operator;
        while (true){
            System.out.print("사칙연산 기호를 입력하세요: ");
            operator = sc.next().charAt(0);

            if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                return operator;
            }
            else{
                System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
            }
        }
    }
}
