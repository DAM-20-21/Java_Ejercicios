/*
 *Sentencia Condicional
 *
 *
 */
package Capitulo_4;

import java.util.Scanner;

/**
 *
 * @author Jorgito
 */
public class Ejercicio2 {
  
    public static void main (String [] args){
        
        System.out.println("Introducta la hora del día  de 0 horas a 23 horas");
        int hora;
        
        Scanner a= new Scanner (System.in);
        hora = a.nextInt();
        
        if ((hora >=6) && (hora <= 12)){
        
        System.out.println("Buenos días");
        
    }
        
           if ((hora >=13) && (hora <= 20)){
        
        System.out.println("Buenos Tardes");
        
    }
           
            if (((hora >=21) && (hora < 24)) || ((hora <=5)&&(hora >=0))){
        
        System.out.println("Buenos Noches");
        
    }
    
            if ((hora >= 24) || (hora<0 )){
        
        System.out.println("La hora instroducida es erronea");
        
    }       
    
}
    
}
