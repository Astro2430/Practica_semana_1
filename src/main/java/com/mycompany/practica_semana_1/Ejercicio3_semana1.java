package com.mycompany.practica_semana_1;

public class Ejercicio3_semana1 {
    public static void main(String[]args){
    
        double Salario_Tl, Renta, Renta_Tl, Sueldo_xh, Hora, Total;
        
            Sueldo_xh = 8;
            Hora = 36;
            Renta = 0.10;
            
            Salario_Tl= Sueldo_xh*Hora;
            Renta_Tl= Salario_Tl*Renta;
            Total= Salario_Tl - Renta_Tl;
            
            System.out.println("El salario total es:" + Total);
      
            
    }
    
}
