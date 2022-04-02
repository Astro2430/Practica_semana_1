package com.mycompany.practica_semana_1;

public class Ejercicio2_semana1 {
    public static void main(String[] args){
    
        double Dolares,Europa,Reino_Unido, Australia, Canada, usd;
        
        Dolares = 100;
        Europa = 0.70;
        Reino_Unido = 0.61;
        Australia = 0.95;
        Canada = 0.97;
        usd = 1.00;
        
    double conversion1 = Dolares*Europa;
        System.out.println("La covensercion de Dolares a la moneda de Europa es : " + conversion1); 
    double conversion2 = Dolares*Reino_Unido;
        System.out.println("La covensercion de Dolares a la moneda de Reino Unido es : " + conversion2); 
    double conversion3 = Dolares*Australia;
        System.out.println("La covensercion de dolares a la moneda de Australia es : " + conversion3); 
    double conversion4 = Dolares*Canada;
         System.out.println("La covensercion de dolares a la moneda de Canada es : " + conversion4);
     double conversion5 = Dolares*usd;
        System.out.println("La covensercion de dolares a la moneda  de USD es : " + conversion5); 
     
     
    
    }
}
