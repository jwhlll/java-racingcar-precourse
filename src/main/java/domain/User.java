package domain;

import view.RacingCarView;

import java.util.InputMismatchException;

public class User {

    public static int userTryNumberInput() {
        int tryNumber;
        try {
            tryNumber = RacingCarView.inputTryNumber();
        } catch (InputMismatchException e) {
            tryNumber = userTryNumberInput();
        }

        return tryNumber;
    }
}
