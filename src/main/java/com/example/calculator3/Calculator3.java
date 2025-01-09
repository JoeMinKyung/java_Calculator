package com.example.calculator3;

public class Calculator3 {
    // 사칙연산을 표현하기 위한 Enum 클래스
    public enum OperatorType {
        // 덧셈 연산
        ADD('+') {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        },
        // 뺄셈 연산
        SUBTRACT('-') {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        },
        // 곱셈 연산
        MULTIPLY('*') {
            @Override
            public int apply(int a, int b) {
                return a * b;
            }
        },
        // 나눗셈 연산
        DIVIDE('/') {
            @Override
            public int apply(int a, int b) {
                if (b == 0) { // 0으로 나누려는 경우 예외 발생
                    throw new ArithmeticException("나눗셈 연산에서 분모가 0입니다.");
                }
                return a / b;
            }
        };

        // 연산자를 나타내는 기호
        private final char symbol;

        // Enum 생성자: 각 연산자에 해당하는 기호를 초기화
        OperatorType(char symbol) {
            this.symbol = symbol;
        }

        // 연산자 기호를 반환 (Getter)
        public char getSymbol() {
            return symbol;
        }

        // 추상 메서드: 각 연산자가 고유의 로직으로 구현해야 함
        public abstract int apply(int a, int b);

        // 입력된 기호에 해당하는 OperatorType 반환
        // public static으로 선언하여 OperatorType의 객체 없이 호출 가능
        public static OperatorType fromSymbol(char symbol) {
            // Enum의 모든 값(ADD, SUBTRACT, MULTIPLY, DIVIDE)을 순회
            for (OperatorType type : OperatorType.values()) {
                if (type.getSymbol() == symbol) {
                    return type; // 기호가 일치하는 연산자 반환
                }
            }
            // 입력된 기호가 유효하지 않으면 예외 발생
            throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol);
        }
    }
}
