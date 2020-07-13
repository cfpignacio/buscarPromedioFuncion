/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscar;

/**
 *
 * @author Notebook
 */
public class Buscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {5,10,7};
        
       System.out.println(promedioArreglo(numeros));
       
        
    }
    // creo funcion para buscar un numero dentro de un arreglo
    public static boolean buscarNumero(int[] arreglo, int numero){
        boolean encontrado = false;
        
        for(int num : arreglo){
            if(num == numero){
                encontrado = true;
            }
        }
        
        return encontrado;
    } 
    
    public static float promedioArreglo(int[] arreglo){
       int suma = 0;
      
       for(int i = 0; i < arreglo.length; i++){
           
           suma = suma + arreglo[i];
       }
       
       return suma/arreglo.length;
       
    }
    
}
