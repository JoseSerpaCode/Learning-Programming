// Clase para las funciones logicas de una lavadora

package Libreria;

public class Lavadora {
    private int kilos = 0, tipoR = 0, llenadoCompleto = 0, lavadoCompleto = 0, secadoCompleto = 0;
    
    public Lavadora(int kilos, int tipoR){ // Constructor para alojar el almacenamiento de la varibale kilos y tipoR (tipo de ropa)
        this.kilos = kilos;
        this.tipoR = tipoR;
    }
    
    private void Llenado(){ // Método de llenado para conocer si el peso de la ropa es el adecuado
        if (getKilos()<=12) {
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }
    
    private void Lavado(){ // Método para lavar la ropa dependiendo de su tipo
        Llenado();
        
        if (llenadoCompleto == 1) {
            switch (tipoR) {
                case 1 -> {
                    System.out.println("Ropa Blanca / Lavado Suave");
                }
                case 2 -> {
                    System.out.println("Ropa de Color / Lavado Intenso");
                }
                default -> {
                    System.out.println("El ipo de ropa no está disponible");
                }
            }
            System.out.println("Lavando...");
            lavadoCompleto = 1;
        }
    }
    
    private void Secado(){ // Método que indica que la ropa se ha secado
        Lavado();
        
        if (lavadoCompleto == 1) {
            System.out.println("Secando...");
            secadoCompleto = 1;
        } 
    }
    
    public void CicloFinalizado(){ // Método que indica que el Ciclo ha sido realizado correctamente
        Secado();
        
        if (secadoCompleto == 1) {
            System.out.println("El ciclo ha sido finalizado");
        }
    }
    
    //Setter y Getter
    
    public int getTipoR(){
        return tipoR;
    }
    
    public void setTipoR(int tipoR){
        this.tipoR = tipoR;
    }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }
    
}