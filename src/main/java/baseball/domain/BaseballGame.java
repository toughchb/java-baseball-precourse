package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    private final List<Ball> computerBalls;

    public BaseballGame(List<Integer> answers) {
        this.computerBalls = convertToBalls(answers);
    }

    private List<Ball> convertToBalls(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < answers.size(); i++) {
            balls.add(new Ball(i + 1, answers.get(i)));
        }
        return balls;
    }

    public GameResult play(List<Integer> inputNumbers) {
        List<Ball> playerBalls = convertToBalls(inputNumbers);
        GameResult result = new GameResult();

        for (Ball playerBall : playerBalls) {
            BallStatus status = play(playerBall);
            result.report(status);
        }
        return result;
    }

    public BallStatus play(Ball playerBall) {
        List<BallStatus> statusList = new ArrayList<>();
        for (Ball computerBall : computerBalls) {
            statusList.add(playerBall.play(computerBall));
        }
        return getBallStatus(statusList);
    }

    private BallStatus getBallStatus(List<BallStatus> statusList) {
        if (isContainsBall(statusList)) return BallStatus.BALL;
        if (isContainsStrike(statusList)) return BallStatus.STRIKE;
        return BallStatus.NOTHING;
    }

    private boolean isContainsBall(List<BallStatus> statusList) {
        return statusList.contains(BallStatus.BALL);
    }

    private boolean isContainsStrike(List<BallStatus> statusList) {
        return statusList.contains(BallStatus.STRIKE);
    }

}
