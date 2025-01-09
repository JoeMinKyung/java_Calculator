package com.example.calculator3;

public class Calculator3 {
    // 사칙연산을 표현하기 위한 Enum 클래스
    public enum OperatorType {
        // 덧셈 연산
        ADD('+') {
            @Override
            public <T extends Number> T apply(T a, T b) {
                return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
            }
        },
        // 뺄셈 연산
        SUBTRACT('-') {
            @Override
            public <T extends Number> T apply(T a, T b) {
                return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
            }
        },
        // 곱셈 연산
        MULTIPLY('*') {
            @Override
            public <T extends Number> T apply(T a, T b) {
                return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
            }
        },
        // 나눗셈 연산
        DIVIDE('/') {
            @Override
            public <T extends Number> T apply(T a, T b) {
                if (b.doubleValue() == 0) { // 0으로 나누려는 경우 예외 발생
                    throw new ArithmeticException("나눗셈 연산에서 분모가 0입니다.");
                }
                return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
            }
        };

        private final char symbol;

        // Enum 생성자: 각 연산자에 해당하는 기호를 초기화
        OperatorType(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }

        // 추상 메서드: 각 연산자가 고유의 로직으로 구현해야 함
        public abstract <T extends Number> T apply(T a, T b);

        // 입력된 기호에 해당하는 OperatorType 반환
        public static OperatorType fromSymbol(char symbol) {
            for (OperatorType type : OperatorType.values()) {
                if (type.getSymbol() == symbol) {
                    return type;
                }
            }
            throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol);
        }
    }
}
