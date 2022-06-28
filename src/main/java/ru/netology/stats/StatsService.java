package ru.netology.stats;

/**
 * 1. Рассчитать сумму всех продаж.
 */
public class StatsService {
    public long calcSumSales(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        return totalSum;
    }

    /**
     * 2. Рассчитать среднюю сумму продаж в месяц.
     */
    public long averageSalesAmount(long[] sales) {

        return calcSumSales(sales) / sales.length;
    }

    /**
     * 3. Рассчитать номер месяца, в котором был пик продаж
     * (осуществлены продажи на максимальную сумму)
     * Примечание: в задании нужно найти последний месяц, соответствующий условиям.
     */
    public int monthNumberMaxSales(long[] sales) {
        int maxMonth = 0;
        int counterMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = counterMonth;
            }
            counterMonth++;
        }
        return maxMonth + 1;
    }

    /**
     * 4. Рассчитать номер месяца, в котором был минимум продаж
     * (осуществлены продажи на минимальную сумму)*
     * Примечание: в задании нужно найти последний месяц, соответствующий условиям.
     */
    public int monthNumberMinSales(long[] sales) {
        int minMonth = 0;
        int counterMonth = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = counterMonth;
            }
            counterMonth++;
        }
        return minMonth + 1;
    }

    /**
     * 5. Рассчитать количество месяцев, в которых продажи были ниже среднего
     * (см. п.2)
     */
    public int monthsOfSalesBelowAverage(long[] sales) {
        long average = averageSalesAmount(sales);
        int counterMonths = 0;
        for (long sale : sales) {
            if (sale < average) {
                counterMonths++;
            }
        }
        return counterMonths;
    }

    /**
     * 6. Рассчитать количество месяцев, в которых продажи были выше среднего
     * (см. п.2)
     */
    public int monthsOfSalesAboveAverage(long[] sales) {
        long average = averageSalesAmount(sales);
        int counterMonths = 0;
        for (long sale : sales) {
            if (sale > average) {
                counterMonths++;
            }
        }
        return counterMonths;
    }
}


