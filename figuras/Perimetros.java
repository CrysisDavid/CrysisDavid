package figuras;

class Perimetros {

    public float perimetroCuadrado(float lado) {
        float perimetro = lado * 4;
        System.out.println("El perimetro es: " + perimetro);
        return perimetro;
    }

    public float perimetroCirculo(float diametro) {
        float perimetro = (float) (2 * Math.PI * (diametro / 2));
        System.out.println("El perimetro es: " + perimetro);
        return perimetro;
    }

    public float perimetroRectangulo(float largo, float ancho) {
        float perimetro = (float) (2 * (largo + ancho));
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        return perimetro;
    }

    public float perimetroTriangulo(float lado, float altura) {
        float perimetro = (float) (lado * 3);
        System.out.println("El perimetro del triangulo es: " + perimetro);
        return perimetro;
    }
}
