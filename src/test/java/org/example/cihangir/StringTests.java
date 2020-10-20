package org.example.cihangir;

import static org.assertj.core.api.Assertions.assertThat;
import org.example.cihangir.StringCalculator;
import org.junit.jupiter.api.Test;

public class StringTests {

    @Test
    void EersteTest() {

        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.sum(null);

        assertThat(sum).isEqualTo(0);
    }





    @Test
    void TweedeTest() {

    StringCalculator stringCalculator = new StringCalculator();

    int sum = stringCalculator.sum("");

        assertThat(sum).isEqualTo(0);
    }

    @Test
    void AlsInputTweeIsMoetSumOokTweeReturnen() {

        StringCalculator stringCalculator = new StringCalculator();

        int sum = stringCalculator.sum("2");

        assertThat(sum).isEqualTo(2);
    }

}
