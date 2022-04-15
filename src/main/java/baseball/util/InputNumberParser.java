package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class InputNumberParser {

    public static final List<Integer> parse(String input) {
        List<Integer> result = new ArrayList<>();
        String[] split = input.trim().split("");
        for (String s : split) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }
}
