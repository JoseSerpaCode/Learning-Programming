package figuras;

public class Rectangulo extends Figura {
    
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    public double calcularArea(double lado) {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return (2*base) + (2*altura);
    }
    
}
