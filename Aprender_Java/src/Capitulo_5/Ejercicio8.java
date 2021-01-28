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
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero y le mostraré la tabla de multiplicar: ");
        Scanner sc= new  Scanner(System.in);
        
    
        int numeroIntroducido=sc.nextInt();
        
        for (int i=0; i<=10 ; i++){
            System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
            
        }
    }
}
