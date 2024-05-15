/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author L&J
 */
public class Calculadora {
  public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("No se divide entre 0");
        }
        return num1 / num2;
    }

    public String sin0(double resultado) {
        String retorno = Double.toString(resultado);
        if (resultado % 1 == 0) {
            retorno = retorno.substring(0, retorno.length() - 2);
        }
        return retorno;
    }
}