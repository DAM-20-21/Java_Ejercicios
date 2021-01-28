/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/**
 *
 * @author Jorgito
 */
public class Ejercicio10 {
    
    public static void main(String[] args) throws IOException  {
        
        BufferedReader lector= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca en el mes que ha nacido:(1 - 12) ");
        int mes= Integer.parseInt(lector.readLine());
        
        System.out.println("Introduzca el día :");
        int dia= Integer.parseInt(lector.readLine());
        
        String horoscopo = "";
       
        switch(mes){
            
            case 1:
                if (dia <21){
                    horoscopo = "Capicornio";
                }else {
                    horoscopo = "Acuario";  
                }
                break;
            case 2:
                if (dia <21){
                    horoscopo = "Acuario";
                }else {
                    horoscopo = "Piscis";  
                }
                break;
               
             case 3:
                if (dia <21){
                    horoscopo = "Piscis";
                }else {
                    horoscopo = "Aries";  
                }
                break;
            case 4:
                if (dia <21){
                    horoscopo = "Aries";
                }else {
                    horoscopo = "Tauro";  
                }
                break;
                
             case 5:
                if (dia <21){
                    horoscopo = "Tauro";
                }else {
                    horoscopo = "Geminis";  
                }
                break;
                
             case 6:
                if (dia <21){
                    horoscopo = "Geminis";
                }else {
                    horoscopo = "Cancer";  
                }
                break;
                
             case 7:
                if (dia <21){
                    horoscopo = "Cancer";
                }else {
                    horoscopo = "Leo";  
                }
                break;
             case 8:
                if (dia <21){
                    horoscopo = "Leo";
                }else {
                    horoscopo = "Virgo";  
                }
                break;
             case 9:
                if (dia <21){
                    horoscopo = "Virgo";
                }else {
                    horoscopo = "Libra";  
                }
                break;
                
             case 10:
                if (dia <21){
                    horoscopo = "Libra";
                }else {
                    horoscopo = "Escorpio";  
                }
                break;
             case 11:
                if (dia <21){
                    horoscopo = "Escorpio";
                }else {
                    horoscopo = "Sagitario";  
                }
                break;
             case 12:
                if (dia <21){
                    horoscopo = "Sagitario";
                }else {
                    horoscopo = "Capicornio";  
                }
                break;
                
             default:       
            
               
        }
         System.out.println("Su horoscopo es : " + horoscopo);
    }
}
