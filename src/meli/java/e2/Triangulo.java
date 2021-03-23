package meli.java.e2;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.setName("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura / 2;
    }

    public static void main(String[] args) {
        Triangulo tri = new Triangulo(12, 4);
        System.out.println(tri);
        System.out.println(tri.area());
    }
}
