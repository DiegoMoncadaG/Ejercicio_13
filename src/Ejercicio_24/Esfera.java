package Ejercicio_24;

public class Esfera {
    private double pesoA;
    private double pesoB;
    private double pesoC;

    public Esfera(double pesoA, double pesoB, double pesoC) {
        this.pesoA = pesoA;
        this.pesoB = pesoB;
        this.pesoC = pesoC;
    }

    public String determinarMayorPeso() {
        if (pesoA > pesoB && pesoA > pesoC) {
            return "La esfera A tiene el mayor peso, este es: " + pesoA;
        } else if (pesoB > pesoA && pesoB > pesoC) {
            return "La esfera B tiene el mayor peso, este es: " + pesoB;
        } else {
            return "La esfera C tiene el mayor peso, este es: " + pesoC;
        }
    }
}
