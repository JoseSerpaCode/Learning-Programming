package suma;

public class Suma {
    private int vUno, vDos, Resultado;
    
    public Suma(int valorUno, int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    
    public void Operacion(){
        Resultado = vUno + vDos;
    }
    
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: " + Resultado);
    }
}
