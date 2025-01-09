package com.example.calculator3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {  // T는 Number의 자식 클래스여야 한다.
    // 연산 결과를 저장할 컬렉션 (private으로 캡슐화)
    private final List<T> results = new ArrayList<>();

    // 연산 수행
    public T calculate(T a, T b, Calculator3.OperatorType operatorType) {
        T result = operatorType.apply(a, b);  // 제네릭 타입으로 연산
        // 연산 결과를 저장
        addResult(result);
        return result;
    }

    // 연산 결과를 추가 (Setter)
    private void addResult(T result) {
        results.add(result);
    }

    // 연산 결과를 가져오기 (Getter)
    public List<T> getResults() {
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
