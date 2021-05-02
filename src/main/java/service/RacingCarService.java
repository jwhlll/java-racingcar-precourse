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
        String[] carsName = splitCar(inputCarsStr);
        Cars cars = new Cars(initCars(carsName));

        int tryNumber = User.userTryNumberInput();
    }

    private String[] splitCar(String inputCarsStr) {
        return inputCarsStr.split(",");
    }

    private List<Car> initCars(String[] carNameArr) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNameArr) {
            cars.add(new Car(carName));
        }

        return cars;
    }
}
