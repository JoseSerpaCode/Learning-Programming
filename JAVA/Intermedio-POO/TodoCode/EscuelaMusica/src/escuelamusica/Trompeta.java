package escuelamusica;

class Trompeta extends InstrumentoMusical {

    public Trompeta(String nombreInstrumento, double precio) {
        super(nombreInstrumento, precio);
    }

    @Override
    void tocar() {
        System.out.println("Suena un solo de trompeta :D");
    }

    @Override
    void preparar() {
        limpiarBoquilla();
    }

    private void limpiarBoquilla() {
        System.out.println("Limpiando boquilla, habia mucha saliva D:");
    }
}