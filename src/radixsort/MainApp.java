/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radixsort;

import java.util.Arrays;

/**
 *
 * @author Berke
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
        
          public static void main(String[] args) {
        System.out.println("O R D E N A M I  E N T O     R A D I X     S O R T");
            System.out.println("...............................................");
            System.out.println("");
        System.out.println("Los numeros a ordenar son los siguientes: 😉");
        int[] arr = { 11, 23, 65, 98, 102, 78, 36, 5 };
        System.out.println(Arrays.toString(arr));
        new RadixSort(arr).sort();
        System.out.println("");
        System.out.println("..................................");
        System.out.println("");
        System.out.println("Los numeros ordanados correctamente 😘");
        System.out.println(Arrays.toString(arr));
    }
    
}
