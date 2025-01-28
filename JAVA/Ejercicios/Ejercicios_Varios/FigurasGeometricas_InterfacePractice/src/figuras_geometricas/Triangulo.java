package figuras_geometricas;

public class Triangulo implements FiguraGeometrica {

    private final double lado1;
    private final double lado2;
    private final double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\tInformacion de la Figura\n");
        System.out.println("Tipo de figura: Triangulo");
        System.out.println("Su area es: " + calcularArea());
        System.out.println("Su perimetro es: " + calcularPerimetro());
        System.out.println("La medidad de sus lados son: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());
        System.out.println("-".repeat(50));
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
}
