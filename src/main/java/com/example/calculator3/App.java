package com.example.calculator3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calc = new ArithmeticCalculator<>(); // Double을 사용할 수 있도록 제네릭 지정

        while (true) {
            // 첫번째 숫자 입력받기
            double firstNum = getPositiveDouble(sc, "첫 번째 숫자를 입력하세요: ");
            // 두번째 숫자 입력받기
            double secondNum = getPositiveDouble(sc, "두 번째 숫자를 입력하세요: ");
            // 사칙연산 기호 입력받기
            char operatorSymbol = getOperator(sc);

            try {
                Calculator3.OperatorType operatorType = Calculator3.OperatorType.fromSymbol(operatorSymbol);
                Double result = calc.calculate(firstNum, secondNum, operatorType);  // Double 타입으로 연산
                System.out.println("결과: " + result);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage());
            }

            if (!continueOrExit(sc, calc)) {
                break;
            }
        }
    }

    // 양의 실수(double) 입력받는 메서드
    private static double getPositiveDouble(Scanner sc, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            String input = sc.next();

            try {
                number = Double.parseDouble(input);
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("0 이상의 실수를 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("유효한 실수를 입력해주세요.");
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
    private static boolean continueOrExit(Scanner sc, ArithmeticCalculator<Double> calc) {
        while (true) {
            System.out.println("연산 결과 조회: 1, 연산 결과 삭제: 2, 더 계산하려면 아무 키나 입력해주세요. (exit 입력 시 종료)");

            String input = sc.next();

            if (input.equals("exit")) {
                return false;
            } else if (input.equals("1")) {
                calc.printResults();
            } else if (input.equals("2")) {
                System.out.println("가장 먼저 저장된 데이터를 삭제합니다. 삭제하시겠습니까? (y, n)");
                String response = sc.next();
                if (response.equalsIgnoreCase("y")) {
                    calc.removeResult();
                } else if (response.equalsIgnoreCase("n")) {
                    continue;
                } else {
                    System.out.println("y 또는 n을 눌러주세요.");
                    continue;
                }
            } else {
                return true;
            }
        }
    }
}
