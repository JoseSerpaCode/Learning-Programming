package foreach;

import java.util.ArrayList;

public class ForEach {

    public static void main(String[] args) {
        //Crear una lista de vocales
        ArrayList<String> vocales = new ArrayList<>();
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");
        
        //Recorrer la lista usando ForEach
        vocales.forEach(variable ->{
            System.out.println(vocales);
        });
        
        //Recorrer la lista usando ForEach usando referencia a un método --> ::
        vocales.forEach(System.out::println);
        
    }
    
}
