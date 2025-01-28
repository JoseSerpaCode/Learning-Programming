package calculadora;

public class CalculadoraCientifica extends Calculadora{
    @Override
    public int sumar(int numUno, int numDos) {
        System.out.println("Usted está usando la versión científica de la calculadora.");
        return numUno + numDos;
    }
}
