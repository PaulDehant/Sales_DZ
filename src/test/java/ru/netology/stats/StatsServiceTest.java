package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class StatsServiceTest {

        @Test
        public void shouldSumAllSales() {
            StatsService service = new StatsService();
            int[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedSum = 755;
            int actualSum = service.sumAllSales(sale);

            Assertions.assertEquals(expectedSum, actualSum);
            System.out.println(expectedSum == actualSum);
        }

        @Test
        public void averageSalesPerMonth() {
            StatsService service = new StatsService();

           int[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedAverage = 53;
            int actualAverage = service.averageSalesPerMonth(sale);

            Assertions.assertEquals(expectedAverage, actualAverage);
            System.out.println(expectedAverage == actualAverage);
        }

        @Test
        public void minMonthNumber() {
            StatsService service = new StatsService();

            int[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedMinMonth = 0;
            int actualMinMonth = service.minMonthNumber(sale);

            Assertions.assertEquals(expectedMinMonth, actualMinMonth);
            System.out.println(expectedMinMonth == actualMinMonth);
        }

        @Test
        public void maxMonthNumber() {
            StatsService service = new StatsService();

            int[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedMaxMonth = 11;
            int actualMaxMonth = service.maxMonthNumber(sale);

            Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
            System.out.println(expectedMaxMonth == actualMaxMonth);
        }


        @Test
        public void averageSalesMinMonth() {
            StatsService service = new StatsService();

           int[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedMinAverage = 7;
            int actualMinAverage = service.averageSalesMinMonth(sale);

            Assertions.assertEquals(expectedMinAverage, actualMinAverage);
            System.out.println(expectedMinAverage == actualMinAverage);
        }

        @Test
        public void averageSalesMaxMonth() {
            StatsService service = new StatsService();

            int[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedMaxAverage = 7;
            int actualMaxAverage = service.averageSalesMaxMonth(sale);

            Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
            System.out.println(expectedMaxAverage == actualMaxAverage);
        }
    }
