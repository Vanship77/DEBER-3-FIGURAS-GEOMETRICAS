package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un círculo
        System.out.print("Ingrese el radio del círculo en cm: ");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("Área del círculo: " + circulo.calcularArea() + " cm²");
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro() + " cm");

        // Crear un cuadrado
        System.out.print("Ingrese la longitud del lado del cuadrado en cm: ");
        double ladoCuadrado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea() + " cm²");
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro() + " cm");

        // Crear un triángulo
        System.out.print("Ingrese la base del triángulo en cm: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo en cm: ");
        double alturaTriangulo = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
        System.out.println("Área del triángulo: " + triangulo.calcularArea() + " cm²");
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro() + " cm");

        // Crear un triángulo rectángulo
        System.out.print("Ingrese la base del triángulo rectángulo en cm: ");
        double baseTrianguloRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo rectángulo en cm: ");
        double alturaTrianguloRectangulo = scanner.nextDouble();
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(baseTrianguloRectangulo, alturaTrianguloRectangulo);

        System.out.println("Área del triángulo rectángulo: " + trianguloRectangulo.calcularArea() + " cm²");
        System.out.println("Perímetro del triángulo rectángulo: " + trianguloRectangulo.calcularPerimetro() + " cm");
        System.out.println("Hipotenusa del triángulo rectángulo: " + trianguloRectangulo.calcularHipotenusa() + " cm");
        System.out.println("Tipo de triángulo rectángulo: " + trianguloRectangulo.determinarTipo());

        // Cerrar el escáner
        scanner.close();
    }
}