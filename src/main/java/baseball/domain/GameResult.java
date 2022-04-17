package baseball.domain;

public class GameResult {
    private int ball = 0;
    private int strike = 0;

    public void report(BallStatus status) {
        if (status.isBall()) {
            increaseBallCount();
        }
        if (status.isStrike()) {
            increaseStrikeCount();
        }
    }

    public boolean isNotGameFinish() {
        return strike != 3;
    }

    private void increaseStrikeCount() {
        this.strike += 1;
    }

    private void increaseBallCount() {
        this.ball += 1;
    }

    public int getBall() {
        return this.ball;
    }

    public int getStrike() {
        return this.strike;
    }
}
