package baseball.util;

import baseball.common.BaseballGameConstants;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputNumberValidator {

    public static void validate(List<Integer> numbers) {
        countValidate(numbers);
        numbersValidate(numbers);
        dupNumberValidate(numbers);
    }

    private static void countValidate(List<Integer> numbers) {
        if (numbers.size() != BaseballGameConstants.SIZE)
            throw new IllegalArgumentException(BaseballGameConstants.SIZE + "개의 숫자를 입력 하셔야 합니다.");
    }

    private static void numbersValidate(List<Integer> numbers) {
        for (Integer number : numbers) {
            numberValidate(number);
        }
    }

    private static void numberValidate(int number) {
        if (number < BaseballGameConstants.START_INCLUSIVE || number > BaseballGameConstants.END_INCLUSIVE) {
            throw new IllegalArgumentException("잘못된 값을 입력 하셨습니다.");
        }
    }

    private static void dupNumberValidate(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);
        if (numbers.size() != numberSet.size()) throw new IllegalArgumentException("중복된 값을 입력 하셨습니다.");

    }
}
