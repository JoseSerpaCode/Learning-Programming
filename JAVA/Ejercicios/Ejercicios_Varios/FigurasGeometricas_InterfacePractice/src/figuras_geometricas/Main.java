package figuras_geometricas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuraGeometrica = new ArrayList<>();
        figuraGeometrica.add(new Circulo(20));
        figuraGeometrica.add(new Circulo(20));
        figuraGeometrica.add(new Rectangulo(12.2, 90.1));
        figuraGeometrica.add(new Rectangulo(102.1, 2));
        figuraGeometrica.add(new Triangulo(12.2, 12.1, 2));
        figuraGeometrica.add(new Triangulo(11.1, 4, 3));
        
        for (FiguraGeometrica figuraGeometricas : figuraGeometrica) {
            figuraGeometricas.mostrarInformacion();
        }
        
    }
}
