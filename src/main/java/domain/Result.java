package domain;

import model.Cars;
import view.RacingCarView;

public class Result {

    public static void process(int tryNumber, Cars cars) {
        int i=0;
        RacingCarView.outputProcessResult();
        while(tryNumber > i++) {
            cars.run();
            RacingCarView.outputResult(cars);
        }
    }
}
