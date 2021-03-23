package meli.java;

import meli.java.e2.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Prueba figuras geometricas
        FiguraGeometrica rec = new Rectangulo(2.4, 3.5);
        FiguraGeometrica tri = new Triangulo(1, 3);
        FiguraGeometrica cir = new Circulo(2.4);
        FiguraGeometrica arr[] = {rec, tri, cir};
        System.out.println(GeometricUtils.areaPromedio(arr));
    }
}
