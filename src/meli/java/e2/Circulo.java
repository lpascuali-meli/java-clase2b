package meli.java.e2;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.setName("Circulo");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public static void main(String[] args) {
        Circulo cir = new Circulo(12);
        System.out.println(cir);
        System.out.println(cir.area());
    }
}
