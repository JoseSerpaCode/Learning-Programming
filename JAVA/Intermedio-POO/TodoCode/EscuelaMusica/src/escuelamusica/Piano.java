package escuelamusica;

class Piano extends InstrumentoMusical {

    public Piano(String nombreInstrumento, double precio) {
        super(nombreInstrumento, precio);
    }

    @Override
    void tocar() {
        System.out.println("Tocando una buena rola de Beethoven");
    }

    @Override
    void preparar() {
        afinarCuerdas();
        ajustarTono();
    }

    private void afinarCuerdas() {
        System.out.println("Ajustando sonido de la seccion 'Cuerdas'");
    }

    private void ajustarTono() {
        System.out.println("Ajustando 1/8 al Piano");
    }
}