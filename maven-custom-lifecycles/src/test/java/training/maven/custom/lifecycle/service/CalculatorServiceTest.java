package training.maven.custom.lifecycle.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    public void itShouldReturn120WhenInputIs5() {
        CalculatorService calculatorService = new CalculatorService();
        long result = calculatorService.factorial(5);
        assertEquals(120, result);
    }
}