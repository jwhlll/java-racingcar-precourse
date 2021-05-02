package view;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;

import static org.assertj.core.api.Assertions.*;

class RacingCarViewTest {

    @Test
    @DisplayName("실행 횟수 문자열 테스트")
    void try_count_string() {
        String data = "a";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertThatThrownBy(()->{
            RacingCarView.inputTryNumber();
        }).isInstanceOf(InputMismatchException.class);
    }
}