package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {


    @Test
    void strike() {
        Ball com = new Ball(1, 4);
        BallStatus state = com.play(new Ball(1,4));
        assertThat(state).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        Ball com = new Ball(1, 4);
        BallStatus state = com.play(new Ball(2,4));
        assertThat(state).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        Ball com = new Ball(1, 4);
        BallStatus state = com.play(new Ball(2,5));
        assertThat(state).isEqualTo(BallStatus.NOTHING);
    }
}
