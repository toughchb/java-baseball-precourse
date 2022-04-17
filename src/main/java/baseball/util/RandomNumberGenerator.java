package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RandomNumberGenerator {
    public static List<Integer> generateUniqueRandomNumbers(
            final int startInclusive,
            final int endInclusive,
            final int count
    ) {
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() != count) {
            set.add(Randoms.pickNumberInRange(startInclusive, endInclusive));
        }
        return new ArrayList<>(set);
    }
}
