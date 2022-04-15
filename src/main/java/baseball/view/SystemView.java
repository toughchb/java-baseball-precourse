package baseball.view;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class SystemView {

    static ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

     public static void printBallNumberInputMessage() {
         System.out.println(resourceBundle.getString("input.number"));
     }

     public static void printRetryOptionMessage() {
         System.out.println(resourceBundle.getString("input.retry"));
     }

    public static void printScore(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println(resourceBundle.getString("score.nothing"));
        }
        if (ballCount == 0 && strikeCount != 0) {
            String string = resourceBundle.getString("score.strike");
            System.out.println(MessageFormat.format(string, strikeCount));
        }
        if (ballCount != 0 && strikeCount == 0) {
            String string = resourceBundle.getString("score.ball");
            System.out.println(MessageFormat.format(string, ballCount));
        }
        if (ballCount != 0 && strikeCount != 0) {
            String string = resourceBundle.getString("score.ball.strike");
            System.out.println(MessageFormat.format(string, ballCount, strikeCount));
        }
    }

    public static void printGameFinish() {
        System.out.println(resourceBundle.getString("end"));
    }

}
