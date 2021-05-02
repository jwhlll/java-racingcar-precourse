package view;

import model.Car;
import model.Cars;

import java.util.List;
import java.util.Scanner;

public class RacingCarView {

    public static String inputCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분) ");
        return sc.nextLine();
    }

    public static int inputTryNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("시도할 횟수는 몇번 인가요?");
        return sc.nextInt();
    }

    public static void outputProcessResult() {
        System.out.println("실행 결과");
    }

    public static void outputResult(Cars cars) {
        for(Car car: cars.getCars()) {
            System.out.print(car.getName() + ":");
            changePositionToBarView(car.getPosition());
            System.out.println();
        }
        System.out.println();
    }

    public static void outputWinner(List<String> carsName) {
        System.out.println(String.join(",", carsName) + "가 최종 우승했습니다.");
    }

    private static void changePositionToBarView(int cnt) {
        for(int i=0; i<cnt; i++) {
            System.out.print("-");
        }
    }
}
