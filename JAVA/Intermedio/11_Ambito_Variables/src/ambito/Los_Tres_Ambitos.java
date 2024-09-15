package ambito;

public class Los_Tres_Ambitos {
    
    // El ambito de una variable nos permite ingresar a ella dependiendo del lugar donde fueron declaradas
    
    static int variableEstatica;
    
    int variableGlobal;
    
    void miMetodo(int parametro){
        int varibaleLocal = 0;
        //El parametro también es local dentro del método
    }
    
}
