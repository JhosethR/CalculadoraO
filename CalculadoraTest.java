package com.mycompany.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest { 
    public CalculadoraTest() {
    }
    
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double num1 = 10.0;
        double num2 = 8.0;
        Calculadora instance = new Calculadora();
        double expResult = 18.0;
        double result = instance.sumar(num1, num2);
        assertEquals(expResult, result, 0);  
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        double num1 = 20.0;
        double num2 = 8.0;
        Calculadora instance = new Calculadora();
        double expResult = 12.0;
        double result = instance.restar(num1, num2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double num1 = 8.0;
        double num2 = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = 40.0;
        double result = instance.multiplicar(num1, num2);
        assertEquals(expResult, result, 0);  
    }
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double num1 = 50.0;
        double num2 = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.dividir(num1, num2);
        assertEquals(expResult, result, 0);    
    }
     @Test
    public void testDividirPorCero() {
        System.out.println("Test dividir por cero");
        Calculadora calculadora = new Calculadora();
        // Prueba de división por cero
        double num1 = 10.0;
        double num2 = 0.0;
        try {
            calculadora.dividir(num1, num2);
            fail("Se esperaba ArithmeticException pero no se lanzó ninguna excepción");
        } catch (ArithmeticException e) {
            assertEquals("No se divide entre 0", e.getMessage());
        }
    }

    @Test
    public void testSin0() {
        System.out.println("sin0");
        double resultado = 0.0;
        Calculadora calculadora = new Calculadora();
        
        // Prueba 1: número entero
        double resultado1 = 10.0;
        String expResult1 = "10";
        String result1 = calculadora.sin0(resultado1);
        assertEquals(expResult1, result1);
        // Prueba 2: número decimal
        double resultado2 = 10.5;
        String expResult2 = "10.5";
        String result2 = calculadora.sin0(resultado2);
        assertEquals(expResult2, result2);  
    }
}
