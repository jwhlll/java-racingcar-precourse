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

    @Test
    @DisplayName("자동차 이름 5글자 이상 테스트")
    void  car_name_test() {
        String carName = "abcdef";
        assertThatThrownBy(()->{
            new Car(carName);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5글자 이하만 가능합니다.");
    }
}