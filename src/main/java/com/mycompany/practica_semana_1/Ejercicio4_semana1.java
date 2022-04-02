package com.mycompany.practica_semana_1;

public class Ejercicio4_semana1 {
    public static void main(String[] args){
    
        double AFPT, AFPE, P_AFP, Pago_T, Pago_F, Sueldo ;
        
        Sueldo = 500;
        AFPT = 0.06;
        AFPE = 0.065;
        P_AFP = Sueldo*AFPT;
        
        Pago_T = Sueldo*AFPE;
        Pago_F = P_AFP+Pago_T;
        
         System.out.println("El esta pagando a la AFP la cantidad de:" + Pago_F );
                
    }
    
}
