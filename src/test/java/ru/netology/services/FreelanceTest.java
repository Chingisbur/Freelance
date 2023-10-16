package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.Freelance;

public class FreelanceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testCalculate(int expected, int income, int expenses, int threshold) {
        Freelance service = new Freelance();

        int actual = service.calculate(income, expenses, threshold);
        //int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testCalculate2(){
//        Freelance service = new Freelance();
//
//        int actual = service.calculate(100_000,60_000,150_000);
//        int expected = 2;
//
//        Assertions.assertEquals(expected,actual);
//    }
}
