/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Administrador
 */
public class ejerccio {
    public static void main(String[] args) {
        
      double[]notas = {11.5, 15, 18, 11, 13}; 
        double notamayor = 0;
      // Recorrer arreglos valores por valor
        for (int i = 0; i < notas.length; i++) {
            //System.out.println("El valor en la posicion " + i + " => " + notas[i]); 
             if (notas[i]>notamayor) 
                 notamayor = notas[i];
          }  
         System.out.println("La nota mayor = " + notamayor);
       
    
    }
}
