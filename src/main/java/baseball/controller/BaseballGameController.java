package baseball.controller;

import baseball.service.BaseballGameService;
import baseball.view.SystemView;


import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballGameController {

    private static final int OPT_RETRY = 1;
    private static final int OPT_FINISH = 2;

    private final BaseballGameService service = new BaseballGameService();

    public void run() {
        initBaseball();
        startBaseball();
        endBaseball();
        retryBaseball();
    }

    private void initBaseball() {
        service.initGame();
    }

    private void startBaseball() {
        service.playGame();
    }

    private void endBaseball() {
        SystemView.printGameFinish();
    }

    public void retryBaseball() {
        SystemView.printRetryOptionMessage();
        int opt = Integer.parseInt(readLine());
        if (isRetry(opt)) run();
        if (isWrongOption(opt)) throw new IllegalArgumentException("잘못된 옵션 선택 입니다.");
    }

    private boolean isRetry(int opt) {
        return opt == OPT_RETRY;
    }

    private boolean isFinish(int opt) {
        return opt == OPT_FINISH;
    }

    private boolean isWrongOption(int opt) {
        return !isRetry(opt) && !isFinish(opt);
    }
}
