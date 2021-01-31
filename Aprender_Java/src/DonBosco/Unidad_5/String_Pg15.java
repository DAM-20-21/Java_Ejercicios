/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DonBosco.Unidad_5;

//mal formado


import javax.swing.JOptionPane;

/**
 *
 * @author Jorge_MSI
 */
public class String_Pg15 {
    public static void main(String[] args) {
        
        String respuesta;
            do{
                respuesta=JOptionPane.showInputDialog("luis jorgfe");
                if(respuesta.matches("--[0-9]{3}[A-Z]+")==false){
                    JOptionPane.showInputDialog(null, "La expresion encaga con el patron");
                  }  
                } while (respuesta.matches("--[0-9]{3}[A-Z]+")==false);
        
    
                
                JOptionPane.showConfirmDialog(null, "Expresion incorrecta");
                
            }
    
   } 
