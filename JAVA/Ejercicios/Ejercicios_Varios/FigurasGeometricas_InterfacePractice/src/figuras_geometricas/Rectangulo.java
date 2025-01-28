package figuras_geometricas;

public class Rectangulo implements FiguraGeometrica {
    private final double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2*base) + (2*altura);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\tInformacion de la Figura\n");
        System.out.println("Tipo de figura: Rectangulo");
        System.out.println("Su base es: " + getBase());
        System.out.println("Su altura es: " + getAltura());
        System.out.println("Su area es: " + calcularArea());
        System.out.println("Su perimetro es: " + calcularPerimetro());
        System.out.println("-".repeat(50));
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
