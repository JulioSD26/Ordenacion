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
public class Insercion {
//    public static void main(String[] args) {
//        int[] arreglo = {5, 3, 2, 1, 4};
//        System.out.println("Arreglo: ");
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.print(arreglo[i] + " ");
//        }
//        insercion(arreglo);
//        System.out.println("\nArreglo ordenado: ");
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.print(arreglo[i] + " ");
//        }
//    }
    public static int[] insercion(int[] arreglo){
        int aux, j;
        // iniciamos desde el segundo elemento
        for (int i = 1; i < arreglo.length; i++) {
            // guardamos el elemento y lo comparamos con el anterior
            aux = arreglo[i];
            // elemento anterior
            j = i - 1;
            // mientras queden posiciones
            // y el elemento actual(aux) sea menor a los anteriores
            // se cambia a la derecha
            while((j >= 0) && (aux < arreglo[j])){
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux; // insertamos aux en su poisicion
        }
        return arreglo;
    }
    
}
