package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 180;
        long actual = service.calculateSaleSales(sales); // исправлено имя метода
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 15;
        long actual = service.calculateAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 8;
        long actual = service.findMaxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 9;
        long actual = service.findMinSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 5;
        long actual = service.countBelowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 5;
        long actual = service.countAboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}