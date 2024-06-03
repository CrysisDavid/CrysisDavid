/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

import java.util.Scanner;

class Figuras extends Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu seleccion = new Menu();
        Perimetros perimetro = new Perimetros();
        Areas area = new Areas();
        Impresiones impr = new Impresiones();
        int opcion;
        do {
            seleccion.menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    impr.impresionCuadrado();
                    break;
                case 2:
                    impr.impresionCirculo();
                    break;
                case 3:
                    impr.impresionRectangulo();
                    break;
                case 4:
                    impr.impresionesTriangulo();
                default:
                    System.out.println("La opcion ingresada es incorrecta");
            }

        } while (opcion != 9);
        System.out.println("El programa ha finalizado");
    }

}
