package step2.domain;

import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {

    @RepeatedTest(10)
    void 범위_1_이상_45_이하의_랜덤한_숫자를_생성한다() {
        //given
        Number number = Number.create();
        //when & then
        assertThat(number.getNumber()).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(45);
    }
}
