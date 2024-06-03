/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author david
 */
class Impresiones {

    Scanner sc = new Scanner(System.in);
    Areas area = new Areas();
    Perimetros perimetro = new Perimetros();

    void impresionCuadrado() {
        System.out.println("Ingresa el lado del cuadrado");
        float lado = sc.nextInt();
        area.areaCuadrado(lado);
        perimetro.perimetroCuadrado(lado);
    }

    void impresionCirculo() {
        System.out.println("Ingresar el diametro del circulo");
        float diametro = sc.nextInt();
        area.areaCirculo(diametro);
        perimetro.perimetroCirculo(diametro);

    }

    void impresionRectangulo() {
        System.out.println("Ingresar el largo del rectangulo");
        float largo = sc.nextInt();
        System.out.println("Ingresar el ancho del rectangulo");
        float ancho = sc.nextInt();
        area.areaRectangulo(largo, ancho);
        perimetro.perimetroRectangulo(largo, ancho);

    }
    
    void impresionesTriangulo(){
        System.out.println("Ingresar la base del triangulo");
        float lado = sc.nextInt();
        System.out.println("Ingresar la altura del triangulo");
        float altura = sc.nextInt();
        area.areaTriangulo(lado, altura);
        perimetro.perimetroTriangulo(lado, altura);
    }
}
