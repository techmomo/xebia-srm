package com.xebia.srm;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        // call calculator
        Calculator calculator = new Calculator(10,2);
        float result = calculator.add();
        System.out.println("SUM IS "+result);
        
        result = calculator.sub();
        System.out.println("DIFF IS "+result);
        
        String name ="Hello";
        String test ="usr";
        int i=0;
        
    }
}
