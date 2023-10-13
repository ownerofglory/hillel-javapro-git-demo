package ua.ithillel.git.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringServiceDefaultTest {
    private StringService stringService;

    @BeforeEach
    public void setUp() {
        stringService = new StringServiceDefault();
    }

    @Test
    public void upperCaseTest() {
        String inputString = "Hello";
        String expectedResult = "HELLO";

        String actualResult = stringService.upperCase(inputString);

        assertEquals(expectedResult, actualResult);
    }
}
