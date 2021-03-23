package meli.java.e2;

public class GeometricUtils {
    public static double areaPromedio(FiguraGeometrica arr[]) {
        double sum = 0;
        for (FiguraGeometrica figura: arr) {
            sum += figura.area();
        }
        return sum / arr.length;
    }
}
