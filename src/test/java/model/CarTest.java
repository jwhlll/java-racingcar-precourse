package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("전진 멈춤 횟수 테스트")
    void run_count_size() {
        final int RUN_COUNT = 3;
        Car car = new Car("test1");
        for(int i=0; i<RUN_COUNT; i++){
            car.run();
        }
        assertTrue(car.getPosition() <= RUN_COUNT);
    }
}