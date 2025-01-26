package ejercicio;

public class Main {
    public static void main(String[] args) {
        // Crear un coche
        Coche coche = new Coche("Toyota", "Corolla", 2020, 4);
        coche.mostrarInformacion();
        coche.abrirMaletero();
        coche.arrancar();
        coche.abrirMaletero();
        coche.detener();
        coche.abrirMaletero();
        coche.cerrarMaletero();
        coche.cerrarMaletero();

        System.out.println();

        // Crear una motocicleta
        Motocicleta moto = new Motocicleta("Yamaha", "MT-07", 2019, 700);
        moto.mostrarInformacion();
        moto.hacerCaballito();
        moto.arrancar();
        moto.hacerCaballito();
        moto.detener();
    }
}
