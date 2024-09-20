package com.exercises.T015;
public class lambdaFunction {

AddOperation addOperationFunctional = (a, b) -> a + b;

    public Integer add(Integer a, Integer b, AddOperation addOperation) {
        return addOperation.add(a, b);
    }

    public static void main(String[] args) {
        
    }





    
}