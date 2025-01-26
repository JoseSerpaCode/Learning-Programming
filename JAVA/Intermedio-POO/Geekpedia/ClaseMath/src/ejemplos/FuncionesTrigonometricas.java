package ejemplos;

public class FuncionesTrigonometricas {
    public static void main(String[] args) {
        
        double resultado = 0;
        double AnguloEnGrados = 45;
        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);
        
        //Seno
        resultado = Math.sin(AnguloEnRadianes);
        System.out.println("Seno: " + resultado);
        
        //Coseno
        resultado = Math.cos(AnguloEnRadianes);
        System.out.println("Coseno: " + resultado);
        
        //Tangente
        resultado = Math.tan(AnguloEnRadianes);
        System.out.println("Tangente: " + resultado);
        
        
        //Arco Coseno
        double ValorIngresado = 0.707;
        
        AnguloEnRadianes = Math.acos(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arco coseno de: " + ValorIngresado + " = " + AnguloEnGrados + "°");
        
        //Arco Seno
        
        AnguloEnRadianes = Math.asin(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arco seno de: " + ValorIngresado + " = " + AnguloEnGrados + "°");
        
       //Arco Tangente
        
        AnguloEnRadianes = Math.atan(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arco tangente de: " + ValorIngresado + " = " + AnguloEnGrados + "°");
    }
}
