package domain;

import model.Cars;
import view.RacingCarView;

import java.util.InputMismatchException;

public class User {

    public static Cars userCarsInput() {
        try {
            String inputCarsStr = RacingCarView.inputCar();
            return Cars.create(inputCarsStr);
        } catch (IllegalArgumentException e) {
            return userCarsInput();
        }
    }

    public static int userTryNumberInput() {
        try {
            return RacingCarView.inputTryNumber();
        } catch (InputMismatchException e) {
            return userTryNumberInput();
        }
    }
}
