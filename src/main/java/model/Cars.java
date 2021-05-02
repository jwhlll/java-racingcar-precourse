package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getWinner() {
        List<String> winnerCarsName = new ArrayList<>();
        int maxPositionValue = maxPosition();
        for(Car car : cars) {
            addWinnerCarsName(winnerCarsName, maxPositionValue, car);
        }

        return winnerCarsName;
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

    private void addWinnerCarsName(List<String> winnerCarsName, int maxPositionValue, Car car) {
        if(car.getPosition() == maxPositionValue) {
            winnerCarsName.add(car.getName());
        }
    }
}
