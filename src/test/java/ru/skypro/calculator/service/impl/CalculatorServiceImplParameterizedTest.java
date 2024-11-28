package ru.skypro.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> argumentProvider() {
        return Stream.of(
                Arguments.of(5, 7),
                Arguments.of(200, 1),
                Arguments.of(4, 102),
                Arguments.of(1000, 50)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void plus(int num1, int num2) {
        // given
        Integer expectedResult = num1 + num2;

        // when
        Integer actualResult = calculatorService.plus(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void minus(int num1, int num2) {
        // given
        Integer expectedResult = num1 - num2;

        // when
        Integer actualResult = calculatorService.minus(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void multiply(int num1, int num2) {
        // given
        Integer expectedResult = num1 * num2;

        // when
        Integer actualResult = calculatorService.multiply(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void divide(int num1, int num2) {
        // given
        Integer expectedResult = num1 / num2;

        // when
        Integer actualResult = calculatorService.divide(num1, num2);

        // then
        Assertions.assertEquals(expectedResult, actualResult);

    }

}
