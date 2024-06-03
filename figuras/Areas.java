package figuras;

class Areas {

    public float areaCuadrado(float lado) {
        float area = (float) Math.pow(lado, 2);
        System.out.println("El area es: " + area);
        return area;
    }

    public float areaCirculo(float diametro) {
        float area = (float) (Math.PI * Math.pow((diametro / 2), 2));
        System.out.println("El area es: " + area);
        return area;
    }

    public float areaRectangulo(float largo, float ancho) {
        float area = (float) (ancho * largo);
        System.out.println("El area del rectangulo es: " + area);
        return area;

    }

    public float areaTriangulo(float lado, float altura) {
        float area = (float) ((lado * altura) / 2);
        System.out.println("El area del triangulo es: " + area);
        return area;

    }

}
