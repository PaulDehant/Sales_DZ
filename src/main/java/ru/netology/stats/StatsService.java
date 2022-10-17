package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sale) {
        int sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
        }
        return sum;
    }

    public int averageSalesPerMonth(int[] sale) {
        double average;
        int sum = sumAllSales(sale);
        average = sum / sale.length;
        return (int) average;
    }

    public int minMonthNumber(int[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int maxMonthNumber(int[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int averageSalesMinMonth(int[] sale) {
        double average;
        int sum = sumAllSales(sale);
        int minValue = 0;
        average = sum / sale.length;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < average) {
                minValue++;
            }
        }
        return minValue;
    }

    public int averageSalesMaxMonth(int[] sale) {
        double average;
        int sum = sumAllSales(sale);
        int maxValue = 0;
        average = sum / sale.length;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > average) {
                maxValue++;
            }
        }
        return maxValue;
    }


}
