/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

import java.util.Scanner;

public class Figura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Escoge la figura :");
        System.out.println("1. para el cuadrado");
        System.out.println("2. para el circulo");
        System.out.println("3. para el rectangulo");
        System.out.println("4. para el triangulo");
        System.out.println("5. para el rombo");
        System.out.println("6. para el paralelogramo");
        System.out.println("7. para el trapecio");
        System.out.println("8. para el poligono regular");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Escoge el calculo:");
            System.out.println(" 1. para calcular el area");
            System.out.println(" 2. para calcular el perimetro");
            int calculo = scanner.nextInt();
            System.out.println("Indicar el lador del cuadrado: ");
            String inputLado = scanner.next();
            int Lado = Integer.parseInt(inputLado);

            switch (calculo) {
                case 1:
                    System.out.print("el area del cuadrado es:" + Lado * 4);
                    break;
                case 2:
                    System.out.println("el perimetro del cuadrado es:" + Math.pow(Lado, 2));
                    break;
                default:
                    System.out.println("la opcion no existe");
                    break;
            }

        } else if (opcion == 2) {
            System.out.println("Escoge la opcion:");
            System.out.println(" 1. para calcular el area");
            System.out.println(" 2. para calcular el perimetro");
            int calculo = scanner.nextInt();
            System.out.println("Indicar el diametro del circulo: ");
            String inputDiametro = scanner.next();
            double Diametro = Double.parseDouble(inputDiametro);
            double Pi = 3.1416;
            double radio = (Diametro / 2);

            if (calculo == 1) {
                System.out.println("el area del circulo es:" + (Pi * Math.pow(radio, 2)));
            } else if (calculo == 2) {
                System.out.println("el perimetro del circulo es:" + (2 * Pi * radio));
            }
        } else if (opcion == 3) {
            System.out.println("Escoge la opcion:");
            System.out.println("1. para el area");
            System.out.println("2. para el perimetro");
            int calculo = scanner.nextInt();
            System.out.println("Indicar el ancho del rectangulo: ");
            String inputAncho = scanner.next();
            double Ancho = Double.parseDouble(inputAncho);
            System.out.println("Indicar el largo del rectangulo: ");
            String inputLargo = scanner.next();
            double Largo = Double.parseDouble(inputLargo);

            if (calculo == 1) {
                System.out.println("el area del rectangulo es:" + (Ancho * Largo));
            } else if (calculo == 2) {
                System.out.println("el perimetro del rectangulos es: " + (2 * (Ancho + Largo)));

            }

        } else if (opcion == 4) {
            System.out.println("Escoge la opcion:");
            System.out.println("1. para el area");
            System.out.println("2. para el perimetro");
            int calculo = scanner.nextInt();
            System.out.println("Indicar la altura del triangulo: ");
            String inputAltura = scanner.next();
            double Altura = Double.parseDouble(inputAltura);
            System.out.println("Indicar el lado del triangulo: ");
            String inputLado = scanner.next();
            double Lado = Double.parseDouble(inputLado);

            if (calculo == 1) {
                System.out.println("el area del triangulo es:" + ((Lado * Altura) / 2));
            } else if (calculo == 2) {
                System.out.println("el perimetro del triangulos es: " + Lado * 3);

            }

        } else if (opcion == 5) {
            System.out.println("1. para el area del rombo");
            System.out.println("2. para el perimetro del rombo");
            int calculo = scanner.nextInt();
            System.out.println("Indicar la diagonal mayor del rombo: ");
            String inputDiagonalMayor = scanner.next();
            double DiagonalMayor = Double.parseDouble(inputDiagonalMayor);
            System.out.println("indicar la diagonal menor del rombo: ");
            String inputDiagonalMenor = scanner.next();
            double DiagonalMenor = Double.parseDouble(inputDiagonalMenor);
            System.out.println("indicar el lado del rombo: ");
            String inputLado = scanner.next();
            double Lado = Double.parseDouble(inputLado);

            if (calculo == 1) {
                System.out.println("el area del rombo es: " + ((DiagonalMayor * DiagonalMenor) / 2));
            } else if (calculo == 2) {
                System.out.println("el perimetro del rombo es: " + Lado * 4);
            }

        } else if (opcion == 6) {
            System.out.println("1. para el area del paralelogramo");
            System.out.println("2. para el perimetro del paralelogramo");
            int calculo = scanner.nextInt();
            System.out.println("indicar la base del paralelogramo: ");
            String inputBase = scanner.next();
            double Base = Double.parseDouble(inputBase);
            System.out.println("indicar la altura del paralelogramo: ");
            String inputAltura = scanner.next();
            double Altura = Double.parseDouble(inputBase);
            System.out.println("indicar el lado oblicuo del paralelogramo: ");
            String inputLado_oblicuo = scanner.next();
            double Lado_oblicuo = Double.parseDouble(inputLado_oblicuo);
            if (calculo == 1) {
                System.out.println("el area del paralelogramo es: " + (Base * Altura));
            } else if (calculo == 2) {
                System.out.println("el perimetro del paralelo gramo es :" + (2 * (Lado_oblicuo + Base)));
            }

        } else if (opcion == 7) {
            System.out.println("1. para el area del trapecio");
            System.out.println("2. para el perimetro del trapecio");
            int calculo = scanner.nextInt();
            System.out.println("indicar la base principal del trapecio: ");
            String inputBase_principal = scanner.next();
            double Base_principal = Double.parseDouble(inputBase_principal);
            System.out.println("indicar la base menor del paralelogramo: ");
            String inputBase_menor = scanner.next();
            double Base_menor = Double.parseDouble(inputBase_menor);
            System.out.println("indicar la altura del trapecio: ");
            String inputAltura = scanner.next();
            double Altura = Double.parseDouble(inputAltura);
            System.out.println("indicar el lado izquierdo del trapecio: ");
            String inputLado_izquierdo = scanner.next();
            double Lado_izquierdo = Double.parseDouble(inputLado_izquierdo);
            System.out.println("indicar el lado derecho del trapecio: ");
            String inputLado_derecho = scanner.next();
            double Lado_derecho = Double.parseDouble(inputLado_derecho);

            if (calculo == 1) {

                System.out.println("el area del trapecio es :" + (Altura * (Base_menor + Base_principal) / 2));
            } else if (calculo == 2) {
                System.out.println("el perimetro del trapecio es: "
                        + (Lado_izquierdo + Lado_derecho + Base_menor + Base_principal));
            }

        } else if (opcion == 8) {
            System.out.println("1. para el area");
            System.out.println("2. para el perimetro");
            int calculo = scanner.nextInt();
            System.out.println("indicar el lado del poligono hexagonal: ");
            String inputLado = scanner.next();
            double Lado = Double.parseDouble(inputLado);
            System.out.println("indicar la apotena del poligono hexagonal");
            String inputApotema = scanner.next();
            double Apotema = Double.parseDouble(inputApotema);
            double Perimetro = (Lado * 6);
            if (calculo == 1) {
                System.out.println("el area del poligono hexagonal es: " + (Perimetro * Apotema) / 2);
            } else if (calculo == 2) {
                System.out.println("el perimetro del poligono hexagonal es: " + Perimetro);
            }

        } else {
            System.out.println("opcion no valida");
        }
    }
}
