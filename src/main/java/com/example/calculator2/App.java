package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator2 calc = new Calculator2();

        while (true) {
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

            // 반복 여부 확인하기 (메뉴 출력)
            while (true) {
                System.out.println("연산 결과 조회: 1, 연산 결과 삭제: 2, 더 계산하려면 아무 키나 입력해주세요. (exit 입력 시 종료)");

                String continueText = sc.next();

                if (continueText.equals("exit")) {
                    return; // 메서드 종료
                } else if (continueText.equals("1")) {
                    // 연산 결과 조회
                    calc.printResults();
                } else if (continueText.equals("2")) {
                    // 연산 결과 삭제
                    while(true){
                        System.out.println("가장 먼저 저장된 데이터를 삭제합니다. 삭제하시겠습니까? (y, n)");
                        String input = sc.next();

                        if (input.equals("y")) {
                            calc.removeResult();
                            break; // 다시 메뉴로 돌아가기
                        }
                        else if (input.equals("n")) {
                            break; // 다시 메뉴로 돌아가기
                        }
                        else {
                            System.out.println("y 또는 n을 눌러주세요.");
                        }
                    }
                } else {
                    break;
                }
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
