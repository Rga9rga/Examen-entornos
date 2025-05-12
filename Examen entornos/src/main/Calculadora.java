package main;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author joana
 */
public class Calculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        String nombre = "Mi nombre";

        System.out.println(" Bienvenido a la main.Calculadora de " + nombre);
        System.out.print("Introduce la operación (sumar, restar, multiplicar, dividir): ");
        String operador = scanner.nextLine();

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        try {
            int resultado = calc.operar(operador, a, b);
            System.out.println(" Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("️ Error: " + e.getMessage());
        }
    }

    public int operar(String operador, int a, int b) {
        if (operador.equals("sumar")) {
            System.out.println(" Iniciando operación: SUMAR");
            int resultado = a + b;
            System.out.println("Resultado: " + resultado);
            return resultado;
        } else if (operador.equals("restar")) {
            System.out.println(" Iniciando operación: RESTAR");
            int resultado = a - b;
            System.out.println("Resultado: " + resultado);
            return resultado;
        } else if (operador.equals("multiplicar")) {
            System.out.println(" Iniciando operación: MULTIPLICAR");
            int resultado = a * b;
            System.out.println("Resultado: " + resultado);
            return resultado;
        } else if (operador.equals("dividir")) {
            System.out.println(" Iniciando operación: DIVIDIR");
            if (b == 0) {
                System.out.println("️ Error: División por cero");
                throw new ArithmeticException("División por cero");
            }
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
            return resultado;
        } else {
            System.out.println("⚠️ Error: Operación no válida");
            return 0;
        }
    }
}
