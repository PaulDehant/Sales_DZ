package ru.netology.stats;

public class StatsService {
    public int SumAllSales(long[] sales) {
        int sale[] = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};
        int sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum = sum + sale[i];
        }
        return sum;
    }

    public int AverageSalesPerMonth(long[] sales) {
        int sale[] = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};
        double average;
        double sum = 0;
        for (int i = 0; i < sale.length; i++) {
            sum += sale[i];
        }
        average = sum / sale.length;
        return (int) average;
    }

    public int MinMonthNumber(long[] sales) {
        int sale[] = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int MaxMonthNumber(long[] sales) {
        int sale[] = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int AverageSalesMinMonth(long[] sales) {
        int sale[] = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};
        double average;
        double sum = 0;
        int minValue = 0;
        for (int i = 0; i < sale.length; i++) {
            sum += sale[i];
        }
        average = sum / sale.length;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < average) {
                minValue++;
            }
        }
        return minValue;
    }

    public int AverageSalesMaxMonth(long[] sales) {
        int sale[] = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};
        double average;
        double sum = 0;
        int maxValue = 0;
        for (int i = 0; i < sale.length; i++) {
            sum += sale[i];
        }
        average = sum / sale.length;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > average) {
                maxValue++;
            }
        }
        return maxValue;
    }


}
