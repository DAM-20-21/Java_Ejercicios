/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CEEDCV.unidad6;

import java.util.Scanner;

/**
 *
 * @author Jorge_MSI
 */
public class Ejercicio_9 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        
        // creacion de un vector de tamaño 5 
        int[] vector= new int[5];
        int i;
        System.out.println("Introduce los valores del vector:");
               
        //Llenado  del vector
        for (i=0; i<vector.length; i++){
            vector[i]= in.nextInt();
            }
        System.out.println("El vector introduccido es :" + i);
        
        //Mostar el vector 
        
        for(i=0; i<vector.length ; i++){
            System.out.println(vector[i] + " ");
        
            System.out.println();
            
            
        }
            
            
        
        
    }
}
