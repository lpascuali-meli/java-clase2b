package meli.java.e2;

public class Rectangulo extends FiguraGeometrica{
    private double l1;
    private double l2;

    public Rectangulo(double l1) {
        this.setName("Rectangulo");
        this.l1 = l1;
        this.l2 = l1;
    }

    public Rectangulo(double l1, double l2) {
        this.setName("Rectangulo");
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    @Override
    public double area() {
        return l1 * l2;
    }

    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(12);
        System.out.println(rec);
        System.out.println(rec.area());
    }
}
