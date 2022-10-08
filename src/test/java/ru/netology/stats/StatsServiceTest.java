package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class StatsServiceTest {

        @Test
        public void shouldSumAllSales() {
            StatsService service = new StatsService();

            long[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedSum = 755;
            int actualSum = service.SumAllSales(sale);

            Assertions.assertEquals(expectedSum, actualSum);
            System.out.println(expectedSum == actualSum);
        }

        @Test
        public void AverageSalesPerMonth() {
            StatsService service = new StatsService();

            long[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedAverage = 53;
            int actualAverage = service.AverageSalesPerMonth(sale);

            Assertions.assertEquals(expectedAverage, actualAverage);
            System.out.println(expectedAverage == actualAverage);
        }

        @Test
        public void MinMonthNumber() {
            StatsService service = new StatsService();

            long[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedMinMonth = 0;
            int actualMinMonth = service.MinMonthNumber(sale);

            Assertions.assertEquals(expectedMinMonth, actualMinMonth);
            System.out.println(expectedMinMonth == actualMinMonth);
        }

        @Test
        public void MaxMonthNumber() {
            StatsService service = new StatsService();

            long[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedMaxMonth = 11;
            int actualMaxMonth = service.MaxMonthNumber(sale);

            Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
            System.out.println(expectedMaxMonth == actualMaxMonth);
        }


        @Test
        public void AverageSalesMinMonth() {
            StatsService service = new StatsService();

            long[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedMinAverage = 7;
            int actualMinAverage = service.AverageSalesMinMonth(sale);

            Assertions.assertEquals(expectedMinAverage, actualMinAverage);
            System.out.println(expectedMinAverage == actualMinAverage);
        }

        @Test
        public void AverageSalesMaxMonth() {
            StatsService service = new StatsService();

            long[] sale = {22, 44, 56, 71, 32, 43, 34, 45, 76, 55, 77, 88, 67, 45};

            int expectedMaxAverage = 7;
            int actualMaxAverage = service.AverageSalesMaxMonth(sale);

            Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
            System.out.println(expectedMaxAverage == actualMaxAverage);
        }
    }
