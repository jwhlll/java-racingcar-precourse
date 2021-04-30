package view;

import java.util.Scanner;

public class RacingCarView {

    public static String InputCar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        return sc.nextLine();
    }
}
