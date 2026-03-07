package com.cg;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
   static Calculator cal;
    @BeforeAll
    public static void init(){
        cal=new Calculator();
        System.out.println("Object created successfully : ");
    }

    @AfterAll
    public static void destroy(){
        cal=null;
        System.out.println("Object deleted successfully : ");
    }



    @Test
    @Timeout(value = 5,unit = TimeUnit.MILLISECONDS)
    public void caltest(){

       assertEquals(10,cal.calculate(7,3));
        System.out.println("caltest executed ");
    }



    @Timeout(value = 5,unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @ValueSource(ints = {13,17,19,23,53,63})
    public void isPrimetest(int num){

//        assertTrue(cal.isPrime(7));
//        assertFalse(cal.isPrime(8));
//        assertFalse(cal.isPrime(1));
        assert(cal.isPrime(num));
        System.out.println("Isprime test executed ");
    }
}
