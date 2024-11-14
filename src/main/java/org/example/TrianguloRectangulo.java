package org.example;

public class TrianguloRectangulo extends Triangulo {
    private double ladoA;
    private double ladoB;

    public TrianguloRectangulo(double base, double altura) {
        super(base, altura);
        this.ladoA = base;
        this.ladoB = altura;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
    }

    public String determinarTipo() {
        if (ladoA == ladoB) {
            return "Isósceles";
        } else if (ladoA == calcularHipotenusa() || ladoB == calcularHipotenusa()) {
            return "Equilátero";
        } else {
            return "Escaleno";
        }
    }
}