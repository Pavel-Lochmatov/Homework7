package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {1, 5, 18, 4, 5, 3, 8, 6, 18, 11, 12};
        long expected = 17;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}