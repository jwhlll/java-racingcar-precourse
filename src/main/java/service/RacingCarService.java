package service;

import domain.User;
import model.Cars;
import view.RacingCarView;

public class RacingCarService {

    public void start() {
        Cars cars = User.userCarsInput();
        int tryNumber = User.userTryNumberInput();

        RacingCarView.outputProcessResult();
        for(int i=0; i<tryNumber; i++) {
            cars.run();
            RacingCarView.outputResult(cars);
        }
        RacingCarView.outputWinner(cars.getWinner());
    }
}
