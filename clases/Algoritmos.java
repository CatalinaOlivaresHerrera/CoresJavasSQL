package CoreJsCatalinaOlivares.clases;

import java.util.ArrayList; 

public class Algoritmos {

    // Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false; // 0 y 1 no son primos
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método para invertir un String
    public static String stringEnReversa(String texto) {
        StringBuilder reversa = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversa.append(texto.charAt(i));
        }
        return reversa.toString();
    }

    // Método para verificar si un String es palíndromo
    public static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        String reverso = stringEnReversa(limpio);
        return limpio.equals(reverso);
    }

    // Método que imprime la secuencia FizzBuzz usando ArrayList
    public static void secuenciaFizzBuzz(int numero) {

        ArrayList<String> resultado = new ArrayList<>();

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultado.add("Fizz");
            } else if (i % 5 == 0) {
                resultado.add("Buzz");
            } else {
                resultado.add(String.valueOf(i));
            }
        }

        System.out.println("Secuencia FizzBuzz usando ArrayList:");
        for (String valor : resultado) {
            System.out.print(valor + " ");
        }
        System.out.println(); // salto de línea
    }

    // Método adicional: mostrar números pares e impares usando ArrayList
    public static void mostrarParesEImpares(int limite) {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 1; i <= limite; i++) {
            if (esPar(i)) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }

        System.out.println("\nNúmeros pares hasta " + limite + ": " + pares);
        System.out.println("Números impares hasta " + limite + ": " + impares);
    }
}
//Lo siento por tantos comentarios es para guiarme en el codigo