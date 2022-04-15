package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InputNumberParserTest {

    @Test
    void parseTest() {
        String input = "123";
        List<Integer> parse = InputNumberParser.parse(input);
        assertThat(parse).contains(1,2,3);
    }

    @Test
    @DisplayName("공백이 있을때 parse 테스트")
    void parseTest2() {
        String input = "1234 ";
        List<Integer> parse = InputNumberParser.parse(input);
        assertThat(parse).contains(1,2,3,4);
    }
}