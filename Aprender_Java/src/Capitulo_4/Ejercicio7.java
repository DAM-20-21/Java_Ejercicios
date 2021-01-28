/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_4;

import java.io.*;

/**
 *
 * @author Jorgito
 */
public class Ejercicio7  {
    

    
    public static void main(String[] args) throws IOException{
        
        BufferedReader lector= new BufferedReader (new InputStreamReader (System.in));
        
       //Scanner lector= new Scanner( System.in);
        
        System.out.println("Este programa calcula la media entre 3 notas");
       
        
        
        
        System.out.println("Por favor, introduzca la 1º nota ");
        int nota1 = Integer.parseInt(lector.readLine());
        System.out.println("Por favor, introduzca la 2º nota ");
        int nota2 = Integer.parseInt(lector.readLine());
        System.out.println("Por favor, introduzca la 3º nota ");
        int nota3 = Integer.parseInt(lector.readLine());
        
        int media ;
        media = (nota1 + nota2 + nota3)/3;
        
        
        
        System.out.println(" La media es :"+ media);
        
    }
 
    
}
