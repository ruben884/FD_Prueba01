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
public class Arreglos {
    
    public static void main(String[] args) {
        //Difinir arreglos en 2 lineas
        String[] apellidos;
        apellidos = new String[5];
        
        // Difinir arreglos en 1 linea
        String[] nombre =new String[5];
                
        // Asignar valores a los arreglos
        apellidos[0]= "Cordova"; // Arreglo 1 valor al indice 0
        apellidos[1]= "Ramirez"; // Arreglo 2 valor al indice 1
        apellidos[2]= "Leon"; // Arreglo 3 valor al indice 2
        apellidos[3]= "Perez"; // Arreglo 4 valor al indice 3
        apellidos[4]= "Sanchez"; // Arreglo 5 valor al indice 4
        //apellidos[5]= "Lopez"; // Arreglo 3 valor al indice 2
        
        // difinir arreglos con valores or defecto 
        String[] departamentos = {"Lima","Piura","Tacna","Puno","Curzco","Loreto"};
        
        System.out.println("Tamaño del arrelo departamento: " + departamentos.length);
        System.out.println("Tamaño del arrelo apellido: " + apellidos.length);
        System.out.println("Tamaño del arrelo mombres: " + nombre.length);
    
        departamentos[0] = "Arequipa"; // Modificnado Lima a Arequipa
        
        //Obtener el valor del indice 1
        
        System.out.println("Valor Departamento inidice 1 = " + departamentos[1]);
        
        // Recorrer arreglos valores por valor
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println("El valor en la posicion " + i + " => " + departamentos[i]);
          }  
            
      
           double[]notas = {11.5, 15, 18, 11, 13};
     
    } 
    
    
}
