package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball computerBall;

    @BeforeEach
    void init() {
        computerBall = new Ball(1, 4);
    }

    @Test
    void strike() {
        BallStatus state = computerBall.play(new Ball(1,4));
        assertThat(state).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        BallStatus state = computerBall.play(new Ball(2,4));
        assertThat(state).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        BallStatus state = computerBall.play(new Ball(2,5));
        assertThat(state).isEqualTo(BallStatus.NOTHING);
    }
}
