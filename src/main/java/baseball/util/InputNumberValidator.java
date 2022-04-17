package baseball.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class InputNumberValidator {
    private static final int NUM_COUNT = 3;
    private static final int MAX_NUM = 9;
    private static final int MIN_NUM = 1;

    public static void validate(List<Integer> numbers) {
        countValidate(numbers);
        numbersValidate(numbers);
        dupNumberValidate(numbers);
    }

    private static void countValidate(List<Integer> numbers) {
        if (numbers.size() != NUM_COUNT) throw new IllegalArgumentException(NUM_COUNT + "개의 숫자를 입력 하셔야 합니다.");
    }

    private static void numbersValidate(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            numberValidate(iterator.next());
        }
    }

    private static void numberValidate(int number) {
        if (number < MIN_NUM || number > MAX_NUM) {
            throw new IllegalArgumentException("잘못된 값을 입력 하셨습니다.");
        }
    }

    private static void dupNumberValidate(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);
        if (numbers.size() != numberSet.size()) throw new IllegalArgumentException("중복된 값을 입력 하셨습니다.");

    }
}
