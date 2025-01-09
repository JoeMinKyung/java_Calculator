package com.example.calculator3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calc = new ArithmeticCalculator();

        while (true) {
            // 첫번째 숫자 입력받기
            int firstNum = getPositiveInteger(sc, "첫 번째 숫자를 입력하세요: ");
            // 두번째 숫자 입력받기
            int secondNum = getPositiveInteger(sc, "두 번째 숫자를 입력하세요: ");
            // 사칙연산 기호 입력받기
            char operatorSymbol = getOperator(sc);

            // 연산 수행 및 출력하기
            try {
                Calculator3.OperatorType operatorType = Calculator3.OperatorType.fromSymbol(operatorSymbol);
                int result = calc.calculate(firstNum, secondNum, operatorType);
                System.out.println("결과: " + result);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage());
            }

            if (!continueOrExit(sc, calc)) {
                break;
            }
        }
    }

    // 양의 정수 입력받는 메서드
    private static int getPositiveInteger(Scanner sc, String prompt) {
        int number;
        while (true) {
            System.out.print(prompt);
            String input = sc.next();

            try {
                number = Integer.parseInt(input);
                if (number >= 0) {
                    return number;
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
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            if ("+-*/".indexOf(operator) != -1) {
                return operator;
            }
            System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
        }
    }

    // 반복 여부 확인하기 (메뉴 출력)
    private static boolean continueOrExit(Scanner sc, ArithmeticCalculator calc) {
        while (true) {
            System.out.println("연산 결과 조회: 1, 연산 결과 삭제: 2, 더 계산하려면 아무 키나 입력해주세요. (exit 입력 시 종료)");

            String input = sc.next();

            if (input.equals("exit")) {
                return false; // 메서드 종료
            } else if (input.equals("1")) {
                // 연산 결과 조회
                calc.printResults();
            } else if (input.equals("2")) { // 연산 결과 삭제
                System.out.println("가장 먼저 저장된 데이터를 삭제합니다. 삭제하시겠습니까? (y, n)");
                String response = sc.next();
                if (response.equalsIgnoreCase("y")) {
                    calc.removeResult();
                } else if (response.equalsIgnoreCase("n")) {
                    continue;
                } else {
                    // "y"나 "n"이 아닌 다른 입력이 들어왔을 때 메시지 출력하고 다시 입력받기
                    System.out.println("y 또는 n을 눌러주세요.");
                    continue; // 다시 "y" 또는 "n" 입력을 기다림
                }
            } else {
                return true;
            }
        }
    }
}