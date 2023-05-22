package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CountServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")

    public void testCountingMonthsNotWorking(int expected, int incom, int expense, int threshold) {
        CountService service = new CountService();

        int actual = service.calculate(incom, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }

}

