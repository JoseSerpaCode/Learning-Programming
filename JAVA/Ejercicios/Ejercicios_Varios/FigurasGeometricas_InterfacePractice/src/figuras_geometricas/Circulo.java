package figuras_geometricas;

public class Circulo implements FiguraGeometrica {
    
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * (radio*2);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\tInformacion de la Figura\n");
        System.out.println("Tipo de figura: Circulo");
        System.out.println("Su radio es: " + getRadio());
        System.out.println("Su area es: " + calcularArea());
        System.out.println("Su perimetro es: " + calcularPerimetro());
        System.out.println("-".repeat(50));
    }

    public double getRadio() {
        return radio;
    }
}
