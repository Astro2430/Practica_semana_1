package MiPrimeraAplicacionJava;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AreaDeUnCirculo {
    public static void main (String[] agrs){
        NumberFormat formato = new DecimalFormat("#0.00");
        //Declarar variables
        double area, radio;
        final double pi = 3.1416;
        //Inicializacion de variables
        area = 145;
        //uso de variables
        radio = Math.sqrt(area/pi);
        System.out.println("Radio: " + formato.format(radio) + " cm");
           
}

  }