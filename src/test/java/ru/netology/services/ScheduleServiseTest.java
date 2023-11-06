package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class ScheduleServiseTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/service.csv")
    public void shouldCalculateFirst(int income, int expenses, int threhold, int expected ) {
        ScheduleServise service = new ScheduleServise();

        // подготавливаем данные:

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threhold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


}