package meli.java.e2;

public abstract class FiguraGeometrica {
    private String name;

    public abstract double area();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
