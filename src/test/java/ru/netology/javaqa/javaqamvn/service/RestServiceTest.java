package ru.netology.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")

    public void shouldCalcMonthsOfRest(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
