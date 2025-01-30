package escuelamusica;

import java.util.ArrayList;

public class EscuelaMusica {

    public static void main(String[] args) {
        ArrayList<InstrumentoMusical> instrumentos = crearInstrumentos();
        ejecutarAcciones(instrumentos);
    }

    private static ArrayList<InstrumentoMusical> crearInstrumentos() {
        ArrayList<InstrumentoMusical> instrumentos = new ArrayList<>();
        instrumentos.add(new Piano("Piano Electrico", 2000));
        instrumentos.add(new Trompeta("Trompeta piccolo", 500));
        instrumentos.add(new Violin("Violin 3/4", 120.299));
        return instrumentos;
    }

    private static void ejecutarAcciones(ArrayList<InstrumentoMusical> instrumentos) {
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.mostrarInformacion();
            System.out.println("");
            instrumento.preparar();
            instrumento.tocar();
            System.out.println("-".repeat(50));
        }
    }
}