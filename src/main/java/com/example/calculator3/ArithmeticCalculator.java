package com.example.calculator3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArithmeticCalculator {
    private final List<Double> results = new ArrayList<>();

    // 연산 수행
    public <T extends Number> double calculate(T a, T b, Calculator3.OperatorType operatorType) {
        double result = operatorType.apply(a, b).doubleValue();
        addResult(result);
        return result;
    }

    // 연산 결과 추가
    private void addResult(double result) {
        results.add(result);
    }

    // 연산 결과를 가져오기
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    // 연산 결과 기록 출력
    public void printResults() {
        System.out.println("=========== 연산 기록 ===========");
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

    // 주어진 값보다 큰 연산 결과들 출력 (람다 & 스트림 사용)
    public void printResultsGreaterThan(double value) {
        List<Double> greaterResults = results.stream()
                .filter(result -> result > value)
                .collect(Collectors.toList());

        if (greaterResults.isEmpty()) {
            System.out.println("입력한 값보다 큰 결과는 없습니다.");
        } else {
            System.out.println("=== 입력한 값보다 큰 연산 결과들 ===");
            IntStream.range(0, greaterResults.size())
                    .forEach(i -> System.out.println((i + 1) + ". " + greaterResults.get(i)));

        }
    }
}
