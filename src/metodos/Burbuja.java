/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Julio
 */
public class Burbuja {
//    public static void main(String[] args) {
//        int arreglo[] = {12,32,26,5};
//        System.out.println("arreglo original: ");
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.print(arreglo[i] + " ");
//            
//        }
//        System.out.println("\nArreglo ordenado por metodo burbuja: ");
//        burbuja(arreglo);
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.print(arreglo[i] + " ");
//        }
//    }
    // Creamos un metodo donde recibe como parametro un arreglo de tipo entero
    public static int[] burbuja (int [] arreglo){
        // este for recorre todos los elementos del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            //anidamos otro for para cambiar el elemento si el que sigue es menor a el
            for (int j = 0; j < arreglo.length -1; j++) {
                int elementoActual = arreglo[j];
                int elementoSiguiente = arreglo[j+1];
                // si elemento actual es mayor al elemento siguiente se hace el cambio
                if (elementoActual > elementoSiguiente) {
                    arreglo[j] = elementoSiguiente;
                    arreglo[j+1] = elementoActual;
                    
                }
            }
            
        }
        return arreglo;
    }
}
