package ru.skypro.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.skypro.calculator.exception.DivideByZeroException;


class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void plus() {
        // given
        Integer num1 = 8;
        Integer num2 = 2;
        Integer expectedResult = 10;

        // when
        Integer actualResult = calculatorService.plus(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void minus() {
        // given
        Integer num1 = 8;
        Integer num2 = 2;
        Integer expectedResult = 6;

        // when
        Integer actualResult = calculatorService.minus(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void multiply() {
        // given
        Integer num1 = 8;
        Integer num2 = 2;
        Integer expectedResult = 16;

        // when
        Integer actualResult = calculatorService.multiply(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void divide() {
        // given
        Integer num1 = 8;
        Integer num2 = 2;
        Integer expectedResult = 4;

        // when
        Integer actualResult = calculatorService.divide(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldThrowExceptionWhenNum2IsZero() {
        // given
        Integer num1 = 8;
        Integer num2 = 0;

        // when
        // then
        Assertions.assertThrows(DivideByZeroException.class, () -> calculatorService.divide(num1, num2));

    }
}
