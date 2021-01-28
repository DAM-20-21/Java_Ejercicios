/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_5;

import java.util.Scanner;

/**
 *
 * @author Jorgito
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        int intentos = 4;
       
        boolean acertado= false;
        
        do{
            System.out.println("Introduzca laclave de acceso a la caja fuerte");
            Scanner sc= new Scanner(System.in);
            int numeroIntroducido=sc.nextInt();
           
            
            if (numeroIntroducido == 8888) {  
                acertado=true;
            }else {
                System.out.println("Clave incorrecta");
            }
            intentos --;    
                
            }while((intentos>0) && (!acertado));
            
            
            if (acertado){
                System.out.println("Ha abierto la caja fuerte");
            }else{
                System.out.println("Clave incorecta, ha agotado");
            }
            
        
        
    }
}
