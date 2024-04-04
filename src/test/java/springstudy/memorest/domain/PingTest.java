package springstudy.memorest.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PingTest {
    static Ping ping1;
    @BeforeEach
    void init() {
        ping1 = new Ping(1L, "Hello, Kdogs");
    }
    @Test
    void id() {
        // given
        // when
        Long id = ping1.id();
        // then
        Assertions.assertThat(id).isEqualTo(1L);
    }

    @Test
    void message() {
        // given
        // when
        String msg = ping1.message();
        // then
        Assertions.assertThat(msg).isEqualTo("Hello, Kdogs");
    }
}