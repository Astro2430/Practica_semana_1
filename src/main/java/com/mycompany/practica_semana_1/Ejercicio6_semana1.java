package com.mycompany.practica_semana_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ejercicio6_semana1 {
    public static void main(String[] args){
    
        NumberFormat formato = new DecimalFormat("#0.00");
        double  Promedio,Ev_num1,Ev_num2, Ev_num3, Ev_num4, Ev_num5;
        
        Ev_num1 = 8.*0.25;
        Ev_num2 = 7.5*0.015;
        Ev_num3 = 9.0*0.15;
        Ev_num4 = 8.0*0.20;  
        Ev_num5 = 9.0*0.25;     
        
        Promedio= Ev_num1 + Ev_num2  + Ev_num3 + Ev_num4 + Ev_num5;
                
        System.out.println("Su promedio finall del ciclo es: " + formato.format(Promedio));
    }
}
