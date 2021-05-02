package model;

public class Car {
    private String name;
    private int position;

    final static int MAX_RANDOM_LENGTH = 5;
    final static int MAX_RANDOM_NUMBER = 9;
    final static int RUN_CONDITION = 4;

    public Car(String name) {
        if(name.length() > MAX_RANDOM_LENGTH){
            throw new IllegalArgumentException("자동차 이름은 5글자 이하만 가능합니다.");
        }
        this.name = name;
        position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void run() {
        int randomValue = randomValue();
        if(randomValue > RUN_CONDITION) {
            this.position++;
        }
    }

    private int randomValue() {
        return (int)(Math.random()*MAX_RANDOM_NUMBER);
    }
}
