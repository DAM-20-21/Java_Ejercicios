/*
 *Escribe un programa que pida por teclado  un dia de la semana 
 * y que diga que asignatura toca a primera hora de ese día 
 */
package Capitulo_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/**
 *
 * @author Jorgito
 */
public class Ejercicio_1 {
    
    public static void main(String[] args) throws IOException { 
        String dia;
    
        System.out.println( "Por favor, Introduzca un dia de la semana  y le dire que asignatura le toca a primera  hora");
    
       BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
       
        
       dia = br.readLine();
       
        //   dia = System.console().readLine();
        //String toLowerCase = dia.toLowerCase(); //Convierto a minisculas todas las letras 
       
        
     //   Scanner a= new Scanner(System.in); 
     //   dia = a.nextLine();
       
        
        switch (dia){
            case"lunes":
                System.out.println("Matematicas");
                break;
            case "martes":
                System.out.println("Fisica");
                break;
            case "miercoles":
                System.out.println("Programacion");
                break;
            case "jueves" :
                System.out.println("Sistemas informaticos");
                break;
            case "viernes" :
                System.out.println("Base de datos");
                break;
            default:
                System.out.println("No hay clase ");
           
        }
        
        
    }
}
