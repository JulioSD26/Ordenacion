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
public class Seleccion {
//    public static void main(String[] args) {
//        int[] arreglo = {3,5,2,1,4};
//        
//        System.out.println("El arreglo es: ");
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.print(arreglo[i] + " ");
//        }
//        seleccion(arreglo);
//        System.out.println("\nEl arreglo ordenado es: ");
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.print(arreglo[i] + " ");
//        }
//    }
    
    public static int[] seleccion(int[] arreglo){
        // una variable para guardar el elemento menor del arreglo, otra para guardar la posicion
        // y una variable que nos servira como auxiliar.
        int menor, pos, tmp;
        // usamos un for para recorrer el arreglo hasta la penultima posicion
          for (int i = 0; i < arreglo.length - 1; i++) {
              // guardamos en menor la posicion actual
            menor = arreglo[i];
            pos = i;
            // otro for que inicia en la siguiente posicion
            for (int j = i + 1; j < arreglo.length; j++) {
                // si el elemento siguiente es menor que el elemento guardado en la variable menor
                // guarda el nuevo elemento
                if (arreglo[j] < menor) {
                    menor = arreglo[j];
                    pos = j;
                }
            }
            // 
            if (pos != i) {
                tmp = arreglo[i];
                arreglo[i] = arreglo[pos];
                arreglo[pos] = tmp;
            }
        }
        return arreglo;
    }
}
