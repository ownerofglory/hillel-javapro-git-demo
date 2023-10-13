package ua.ithillel.git.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringServiceDefaultTest {
    private StringService stringService;

    @BeforeAll
    public static void setUpAll() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void setUp() {
        stringService = new StringServiceDefault();
    }

    /**
     * upperCaseTest runs test on upperCase
     * no params
     */
    @Test
    public void upperCaseTest() {
        String inputString = "Hello";
        String expectedResult = "HELLO";

        String actualResult = stringService.upperCase(inputString);

        assertEquals(expectedResult, actualResult);
    }

    @AfterAll
    public void tearDown() {
        System.out.println("Test finished");
    }
}
