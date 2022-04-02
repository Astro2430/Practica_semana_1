package com.mycompany.practica_semana_1;

public class Ejercicio5_semana1 {
    public static void main(String[] args){
    
        double Salario_T, Sueldo, Horas, Sueldo_Hr, Horas_Tl, Renta, Renta_Tl, Tiempo, Total_F;
        
         Sueldo= 10;
         Tiempo= 30;
         Horas= 50;
         Sueldo_Hr = 0.10;
         Renta= 0.10;
         
         Salario_T = Sueldo* Tiempo;
         Horas_Tl = Horas * Sueldo_Hr;
         Total_F= Salario_T + Horas_Tl;
         Renta_Tl= Total_F - Renta;
         
         System.out.println("Su salario total es:" + Renta_Tl);
         
        
    }
}
