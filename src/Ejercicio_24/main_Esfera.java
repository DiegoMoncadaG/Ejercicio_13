package Ejercicio_24;

import java.util.Scanner;

public class main_Esfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        Esfera esfera = new Esfera(pesoA, pesoB, pesoC);
        String resultado = esfera.determinarMayorPeso();

        System.out.println(resultado);
    }
}
