package com.mycompany.practica_semana_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejercicio1_semana1 {

    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        
        double R1, R2, R3, R4, Req, Rdeno;
        
        R1 = 5.1;
        R2 = 68;
        R3 = 75;
        R4 = 82;
        
        Rdeno=((1/R1)+(1/R2)+(1/R3)+(1/R4));
        Req = 1/Rdeno;
        
        System.out.println("La resistencia quivalente es:"+formato.format(Req));
        
                
    }
}
