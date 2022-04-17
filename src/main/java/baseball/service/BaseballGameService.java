package baseball.service;

import baseball.common.BaseballGameConstants;
import baseball.domain.BaseballGame;
import baseball.domain.GameResult;
import baseball.util.InputNumberParser;
import baseball.util.InputNumberValidator;
import baseball.util.RandomNumberGenerator;
import baseball.view.SystemView;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballGameService {

    private BaseballGame baseballGame;

    private List<Integer> inputPlayerNumbers() {
        SystemView.printBallNumberInputMessage();
        String input = readLine();
        List<Integer> numbers = InputNumberParser.parse(input);
        InputNumberValidator.validate(numbers);
        return numbers;
    }

    public void initGame() {
        List<Integer> computerBalls = RandomNumberGenerator.generateUniqueRandomNumbers(BaseballGameConstants.START_INCLUSIVE, BaseballGameConstants.END_INCLUSIVE, BaseballGameConstants.SIZE);
        baseballGame = new BaseballGame(computerBalls);
    }

    public void playGame() {
        GameResult result;
        do {
            List<Integer> inputNumbers = inputPlayerNumbers();
            result = baseballGame.play(inputNumbers);
            SystemView.printScore(result.getBall(), result.getStrike());
        } while (result.isNotGameFinish());
    }
}
