package ru.netology.stats;

public class StatsService {

    // Метод для расчета суммы всех продаж
    public long calculateSaleSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Метод для расчета средней суммы продаж в месяц
    public long calculateAverageSales(long[] sales) {
        return calculateSaleSales(sales) / sales.length;
    }

    // Метод для определения месяца с максимальными продажами
    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Метод для определения месяца с минимальными продажами
    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Метод для расчета количества месяцев с продажами ниже среднего
    public int countBelowAverageSales(long[] sales) {
        long average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Метод для расчета количества месяцев с продажами выше среднего
    public int countAboveAverageSales(long[] sales) {
        long average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;

    }
}