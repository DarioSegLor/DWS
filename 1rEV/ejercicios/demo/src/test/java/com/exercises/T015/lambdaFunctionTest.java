package com.exercises.T015;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class lambdaFunctionTest {
    @Test
    void testAdd() {
        lambdaFunction lambdaFunction = new lambdaFunction();
        assertEquals(3, lambdaFunction.add(1, 2, lambdaFunction.addOperationFunctional));
        
    }
}
