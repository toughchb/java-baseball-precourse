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
        service.startGame();
    }

    private void endBaseball() {
        SystemView.printGameFinish();
    }

    public void retryBaseball() {
        SystemView.printRetryOptionMessage();
        int opt = Integer.parseInt(readLine());
        switch (opt) {
            case OPT_RETRY:
                run();
            case OPT_FINISH:
                break;
            default:
                throw new IllegalArgumentException("잘못된 옵션 선택 입니다.");
        }
    }


}
