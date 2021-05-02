package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars create(String inputCarsStr) {
        String[] carsArr = splitCars(inputCarsStr);
        return new Cars(initCars(carsArr));
    }

    public List<Car> getCars() {
            return cars;
        }

    public List<String> getWinner() {
        List<String> winnerCarNames = new ArrayList<>();
        int maxPositionValue = maxPosition();
        for(Car car : cars) {
            addWinnerCarsName(winnerCarNames, maxPositionValue, car);
        }
        return winnerCarNames;
    }

    public void run() {
        cars.forEach(Car::run);
    }

    private int maxPosition() {
        int max = 0;
        for(Car car : cars) {
            max = Math.max(car.getPosition(), max);
        }
        return max;
    }

    private void addWinnerCarsName(List<String> winnerCarNames, int maxPositionValue, Car car) {
            if(car.getPosition() == maxPositionValue) {
            winnerCarNames.add(car.getName());
        }
    }

    private static String[] splitCars(String inputCarsStr) {
        return inputCarsStr.split(",");
    }

    private static List<Car> initCars(String[] carNameArr) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNameArr) {
            cars.add(new Car(carName));
        }
        return cars;
    }
}
