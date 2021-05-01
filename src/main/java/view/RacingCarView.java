package view;

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
}
