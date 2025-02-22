package com.example.calculator2;

import java.util.List;
import java.util.ArrayList;

public class Calculator2 {
    // 연산 결과를 저장할 컬렉션 (private으로 캡슐화)
    private final List<Integer> results = new ArrayList<>();

    // 연산 수행
    public int calculate(int a, int b, char c) {
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
                    throw new ArithmeticException("나눗셈 연산에서 분모가 0입니다.");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + c);
        }
        // 연산 결과를 저장
        addResult(result);
        return result;
    }

    // 연산 결과를 추가 (Setter)
    private void addResult(int result) {
        results.add(result);
    }

    // 연산 결과를 가져오기 (Getter)
    public List<Integer> getResults() {
        return new ArrayList<>(results); // 캡슐화를 위해 복사본 반환
    }

    // 연산 결과 기록 출력하기
    public void printResults() {
        System.out.println("=== 연산 기록 ===");
        for (int i = 0; i < results.size(); i++) {
            System.out.println((i + 1) + ". " + results.get(i));
        }
    }

    // 가장 먼저 저장된 연산 결과 삭제
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        } else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }
}
