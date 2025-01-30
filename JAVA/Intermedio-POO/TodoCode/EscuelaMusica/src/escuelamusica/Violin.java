package escuelamusica;

class Violin extends InstrumentoMusical {

    public Violin(String nombreInstrumento, double precio) {
        super(nombreInstrumento, precio);
    }

    @Override
    void tocar() {
        System.out.println("Tocando violin!");
    }

    @Override
    void preparar() {
        afinarCuerdas();
    }

    private void afinarCuerdas() {
        System.out.println("Afinando cuerdas del violin");
    }
}