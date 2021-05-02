package service;

import domain.Result;
import domain.User;
import model.Car;
import model.Cars;
import view.RacingCarView;

import java.util.ArrayList;
import java.util.List;

public class RacingCarService {

    public void start() {
        String inputCarsStr = RacingCarView.inputCar();
        Cars cars = Cars.create(inputCarsStr);

        int tryNumber = User.userTryNumberInput();
        Result.process(tryNumber, cars);
        Result.complete(cars);
    }
}
