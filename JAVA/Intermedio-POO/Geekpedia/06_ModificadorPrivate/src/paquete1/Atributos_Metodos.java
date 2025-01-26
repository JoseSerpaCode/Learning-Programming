/*
 *Private: Solo se pueden utilizar las variables en el archivo en que fueron creadas, a menos que se 
creen los métodos getter (obtener) y/o setter (establecer)
*/

package paquete1;

public class Atributos_Metodos {
    private int ValorUno, ValorDos;
    private String ValorTres;
    
    private void metodoSerpa(){
        
    }

    /**
     * @return the ValorUno
     */
    public int getValorUno() {
        return ValorUno;
    }

    /**
     * @return the ValorDos
     */
    public int getValorDos() {
        return ValorDos;
    }

    /**
     * @return the ValorTres
     */
    public String getValorTres() {
        return ValorTres;
    }

    /**
     * @param ValorUno the ValorUno to set
     */
    public void setValorUno(int ValorUno) {
        this.ValorUno = ValorUno;
    }

    /**
     * @param ValorDos the ValorDos to set
     */
    public void setValorDos(int ValorDos) {
        this.ValorDos = ValorDos;
    }

    /**
     * @param ValorTres the ValorTres to set
     */
    public void setValorTres(String ValorTres) {
        this.ValorTres = ValorTres;
    }
}