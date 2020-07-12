package training.maven.custom.lifecycle.service;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class CalculatorService {

    public long factorial(int input) {
        return CombinatoricsUtils.factorial(input);
    }
}
