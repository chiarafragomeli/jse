package com.example.jse.m07.exampleEx;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    void maxPlain() {
        int[] array = { 1, 2, 3, 4 };
        int expected = 4;
        int actual = Example.max(array);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maxNull() {
        assertThatIllegalArgumentException().isThrownBy(() -> Example.max(null)); //funzione lambda/funzione anonima
    }

    @Test
    void maxNullClassic() {
        try {
            Example.max(null);
            fail("Exception expected");
        } catch (IllegalArgumentException illEx) {
            assertThat(illEx.getMessage()).isEqualTo("Array should not be null or empty");

        }
    }
}
