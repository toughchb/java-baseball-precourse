package baseball.service;

import baseball.domain.BaseballGame;
import baseball.domain.GameResult;
import baseball.util.InputNumberParser;
import baseball.util.InputNumberValidator;
import baseball.util.RandomNumberGenerator;
import baseball.view.SystemView;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballGameService {

    private static final int SIZE = 3;
    private static final int START_INCLUSIVE = 1;
    private static final int END_INCLUSIVE = 9;

    private BaseballGame baseballGame;

    private List<Integer> inputPlayerNumbers() {
        SystemView.printBallNumberInputMessage();
        String input = readLine();
        List<Integer> numbers = InputNumberParser.parse(input);
        InputNumberValidator.validate(numbers);
        return numbers;
    }

    public void initGame() {
        List<Integer> computerBalls = RandomNumberGenerator.generateUniqueRandomNumbers(START_INCLUSIVE, END_INCLUSIVE, SIZE);
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
