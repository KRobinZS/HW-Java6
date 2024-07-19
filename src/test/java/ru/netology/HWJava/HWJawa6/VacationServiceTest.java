package ru.netology.HWJava.HWJawa6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "test_data.csv")
    public void testParams(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }


}


