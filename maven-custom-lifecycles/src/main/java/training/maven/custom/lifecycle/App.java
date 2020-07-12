package training.maven.custom.lifecycle;

import training.maven.custom.lifecycle.service.CalculatorService;

public class App {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        System.out.println(calculatorService.factorial(5));
    }
}