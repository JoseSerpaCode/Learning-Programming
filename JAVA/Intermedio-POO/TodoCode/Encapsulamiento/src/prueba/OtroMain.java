package prueba;

import encapsulamiento.Personaje;

public class OtroMain extends Personaje {
    
    public void x(){
        System.out.println(nombre);
        getVida();
    }
    
    public void z(){
        OtroMain a = new OtroMain();
        
        a.danio = 1;
    }
}
