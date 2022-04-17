package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static baseball.domain.BallStatus.BALL;
import static baseball.domain.BallStatus.NOTHING;
import static baseball.domain.BallStatus.STRIKE;
import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {

    private BaseballGame answers;

    @BeforeEach
    void init() {
        answers = new BaseballGame(Arrays.asList(1, 2, 3));
    }

    @Test
    void strike() {
        BallStatus status = answers.play(new Ball(1, 1));
        assertThat(status).isEqualTo(STRIKE);
    }

    @Test
    void ball() {
        BallStatus status = answers.play(new Ball(1, 2));
        assertThat(status).isEqualTo(BALL);
    }

    @Test
    void nothing() {
        BallStatus status = answers.play(new Ball(1, 4));
        assertThat(status).isEqualTo(NOTHING);
    }

    @Test
    void ball1_strike1() {
        GameResult result = answers.play(Arrays.asList(1, 4, 2));
        assertThat(result.getBall()).isEqualTo(1);
        assertThat(result.getStrike()).isEqualTo(1);
    }

    @Test
    void strike3() {
        GameResult result = answers.play(Arrays.asList(1, 2, 3));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(3);
    }

    @Test
    void strike2() {
        GameResult result = answers.play(Arrays.asList(1, 2, 4));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(2);
    }

    @Test
    void strike1() {
        GameResult result = answers.play(Arrays.asList(1, 4, 5));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(1);
    }
}
