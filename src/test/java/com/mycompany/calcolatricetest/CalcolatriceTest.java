/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calcolatricetest;

import java.util.Random;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


/**
 *
 * @author gian
 */
public class CalcolatriceTest {
    
    Calcolatrice c1;
    
    public CalcolatriceTest() {
    }

    @BeforeEach
    private void istanziaCalcolatrice()
    {
        c1=new Calcolatrice();
    }
    
    /**
     * Test of somma method, of class Calcolatrice.
     */
    @Test
    public void testSomma() {
       // Calcolatrice c1=new Calcolatrice();
        int atteso=8;
        int attuale;
        
        attuale=c1.somma(3, 5);
        assertEquals(atteso, attuale);
    }

    /**
     * Test of sottrai method, of class Calcolatrice.
     */
    @Test
    public void testSottrai() {
        // Calcolatrice c1=new Calcolatrice();
        int atteso=8;
        int attuale;
        
        attuale=c1.sottrai(10, 2);
        assertEquals(atteso, attuale,"Sottrazione fra 10 e 2");
    }

    /**
     * Test of dividi method, of class Calcolatrice.
     */
    @Test
    public void testDividi() 
    {
        assertEquals(2,c1.dividi(10, 5));
    }
    
    @Test
    public void testDividiPerZero() 
    {
        ArithmeticException eccezione = assertThrows(ArithmeticException.class, () ->
        c1.dividi(1,0));
    }
    
    @Test
    public void testFibonacci1() throws FibonacciException 
    {
     //   Calcolatrice c1=new Calcolatrice();
        int[] atteso={1};
        int[] attuale=c1.fibonacci(1);
        assertArrayEquals(atteso, attuale);
    }
    
   @Test
    public void testFibonacci2() throws FibonacciException 
    {
     //   Calcolatrice c1=new Calcolatrice();
        int[] atteso={1,1};
        int[] attuale=c1.fibonacci(2);
        assertArrayEquals(atteso, attuale);
    }
    
    @Test
    public void testFibonacci10() throws FibonacciException 
    {
     //   Calcolatrice c1=new Calcolatrice();
        int[] atteso={1,1,2,3,5,8,13,21,34,55};
        int[] attuale=c1.fibonacci(10);
        assertArrayEquals(atteso, attuale);
    }
    
    @Test
    public void testFibonacci0() 
    {
     FibonacciException eccezione = assertThrows(FibonacciException.class, () ->
        c1.fibonacci(0));
    }
    
    @Test
    public void testFibonacciNegativo() 
    {
     FibonacciException eccezione = assertThrows(FibonacciException.class, () ->
        c1.fibonacci(-1));
    }
    
    
    @Test
    public void testValoreAssoluto() 
    {
     //   Calcolatrice c1=new Calcolatrice();
        Random r=new Random();
        int x;
        int attuale;
        
        for(int i=1;i<1000;i++)
        {
            x=r.nextInt(-500,500);
            attuale=c1.valoreAssoluto(x);
            assertTrue(attuale>=0);
        }
    }
    
    
    
}
