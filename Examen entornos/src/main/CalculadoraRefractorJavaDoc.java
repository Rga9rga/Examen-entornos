package main;

import java.util.Scanner;

/**
 * @author Ruben
 * Clase principal que tiene el nombre del usuario y realiza operaciones basicas.
 */
public class CalculadoraRefractorJavaDoc {

    public static void main(String[] args) { // el main lo dejo intacto
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        String nombre = "Rubén Gálvez Álvarez"; // Bueno, he cambiado mi nombre

        System.out.println("Bienvenido a la main.Calculadora de " + nombre);
        System.out.print("Introduce la operación (sumar, restar, multiplicar, dividir): ");
        String operador = scanner.nextLine();

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        try {
            int resultado = calc.operar(operador, a, b);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    /**
     * Realiza una operación entre dos numeros depende la variable operador
     *
     * @param operador Operacion a realizar: "sumar", "restar", "multiplicar", "dividir"
     * @param a Primer numero
     * @param b Segundo numero
     * @return Resultado de la operacion, o 0 si el operador no es valido
     * @throws ArithmeticException si se intenta dividir por cero
     */
    public int operar(String operador, int a, int b) {
        switch (operador) {  // en vez de usar ifs y elses anidados lo meto en un switch case
            case "sumar":
                return sumar(a, b); // creo una funcion sumar para asi poderla usar mas veces
            case "restar":
                return restar(a, b); // creo una funcion restar para asi poderla usar mas veces
            case "multiplicar":
                return multiplicar(a, b); // creo una funcion multiplicar para asi poderla usar mas veces
            case "dividir":
                return dividir(a, b); // creo una funcion dividir para asi poderla usar mas veces
            default:
                System.out.println("⚠️ Error: Operación no válida");
                return 0;
        }
    }

    /**
     * Suma dos numeros enteros
     * @param a Primer numero
     * @param b Segundo numero
     * @return Suma de a y b
     */
    private int sumar(int a, int b) {
        return a + b; // evito poner de nuevo un sout resultado para asi evitar repeticion de codigo, ya que ya esta en el main
    }

    /**
     * Resta dos numeros enteros
     * @param a Primer numero
     * @param b Segundo numero
     * @return Resta de a y b
     */
    private int restar(int a, int b) {
        return a - b; // evito poner de nuevo un sout resultado para asi evitar repeticion de codigo, ya que ya esta en el main
    }

    /**
     * Multiplica dos numeros enteros
     * @param a Primer numero
     * @param b Segundo numero
     * @return Producto de a y b
     */
    private int multiplicar(int a, int b) {
        return a * b; // evito poner de nuevo un sout resultado para asi evitar repeticion de codigo, ya que ya esta en el main
    }

    /**
     * Divide dos numeros enteros
     * @param a Dividendo
     * @param b Divisor
     * @return Division de a entre b
     * @throws ArithmeticException si b es 0
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b; // evito poner de nuevo un sout resultado para asi evitar repeticion de codigo, ya que ya esta en el main
    }
}
