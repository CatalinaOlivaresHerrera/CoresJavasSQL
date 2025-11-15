package CoreJsCatalinaOlivares;

import CoreJsCatalinaOlivares.clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {

        // ==============================================================
        // Objetivo:
        // Ejecutar y verificar el funcionamiento de los metodos de la clase Algoritmos.
        // ==============================================================
        
        System.out.println("========== PRUEBA DE MÉTODOS LÓGICOS ==========");

        // Pruebas de esPar()
        System.out.println("\n>> PRUEBA: esPar()");
        System.out.println("¿4 es par? " + Algoritmos.esPar(4));
        System.out.println("¿7 es par? " + Algoritmos.esPar(7));

        // Pruebas de esPrimo()
        System.out.println("\n>> PRUEBA: esPrimo()");
        System.out.println("¿7 es primo? " + Algoritmos.esPrimo(7));
        System.out.println("¿8 es primo? " + Algoritmos.esPrimo(8));
        System.out.println("¿13 es primo? " + Algoritmos.esPrimo(13));

        // Pruebas de stringEnReversa()
        System.out.println("\n>> PRUEBA: stringEnReversa()");
        System.out.println("Reversa de 'Hola Mundo': " + Algoritmos.stringEnReversa("Hola Mundo"));

        // Pruebas de esPalindromo()
        System.out.println("\n>> PRUEBA: esPalindromo()");
        System.out.println("¿'Anita lava la tina' es palíndromo? " + Algoritmos.esPalindromo("Anita lava la tina"));
        System.out.println("¿'Java' es palíndromo? " + Algoritmos.esPalindromo("Java"));

        // Prueba de secuenciaFizzBuzz() (usando ArrayList)
        System.out.println("\n>> PRUEBA: secuenciaFizzBuzz()");
        Algoritmos.secuenciaFizzBuzz(15);

        //  Prueba adicional: mostrar pares e impares con ArrayList
        System.out.println("\n>> PRUEBA: mostrarParesEImpares()");
        Algoritmos.mostrarParesEImpares(10);

        System.out.println("\n========== FIN DE LA EJECUCIÓN ==========");
    }
}
