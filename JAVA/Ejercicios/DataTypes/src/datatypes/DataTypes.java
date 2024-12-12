package datatypes;

public class DataTypes {

    static byte vByte = 100;
    static short vShort = 2000;
    static int vInt = 30000;
    static long vLong = 400000L;
    static float vFloat = 3.14F;
    static double vDouble = 3.1415161718192021;
    static boolean vBoolean = true;
    static char vChar = 'a';

    public static void main(String[] args) {
        System.out.println(" byte: " + vByte
                + "\n short: " + vShort
                + "\n int: " + vInt
                + "\n long: " + vLong
                + "\n float: " + vFloat
                + "\n double: " + vDouble
                + "\n boolean: " + vBoolean
                + "\n char: " + vChar);

        // Operaciones básicas con los tipos de datos
        System.out.println("\nOperaciones básicas:");
        System.out.println(" Suma de byte y short: " + (vByte + vShort));
        System.out.println(" Producto de int y long: " + (vInt * vLong));
        System.out.println(" División de double y float: " + (vDouble / vFloat));
        System.out.println(" Concatenación de char: " + vChar + "bc");
        System.out.println(" Negación de boolean: " + !vBoolean);
        
        // Ejemplo de límite en los tipos de datos
        System.out.println("\nDemostración de límites:");
        byte limiteByte = 127; // Máximo valor de byte
        System.out.println(" Máximo valor de byte: " + limiteByte);
        limiteByte += 1; // Esto genera un *overflow* al exceder el rango
        System.out.println(" Desbordamiento de byte: " + limiteByte);
    }

}
