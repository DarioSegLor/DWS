package com.exercises.T015;
public class lambdaFunction {

    // Without functional programming

    AddOperation addOperation = new AddOperation() {
        @Override
        public Integer add(Integer a, Integer b){
            return a + b;
        }
    };

    // With functional programming

    AddOperation addOperationFunctional = (a, b) -> a + b;


    public static void main(String[] args) {
        System.out.println("Hello world");

    }

    public Integer add(Integer a, Integer b, AddOperation addOperation) {
        return addOperation.add(a, b);
    }
    
}