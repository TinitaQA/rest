package ru.netology.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    public void shouldCalcMonthsOfRest() {
        RestService service = new RestService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}

