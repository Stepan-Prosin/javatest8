package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ScheduleServiseTest {

    @Test
    void shouldCalculateFirst() {
        ScheduleServise service = new ScheduleServise();

        // подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int threhold = 20000;
        int  expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate( income,  expenses,  threhold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateSecond() {
        ScheduleServise service = new ScheduleServise();

        // подготавливаем данные:
        int income = 100000;
        int expenses = 60000;
        int threhold = 150000;
        int  expected = 2;
        // вызываем целевой метод:
        int actual = service.calculate( income,  expenses,  threhold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}