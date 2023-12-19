package com.kevinolarte.ejercicioios.tema06;

import com.kevinolarte.lib.*;
import java.util.Arrays;

public class EjerOrdenar {

    public EjerOrdenar(){
        int numDesordenados[] = new int[1000];
        Arrayss.randomArray(numDesordenados, 50);

        
        
        
        System.out.println("Antes :");
        for (int i : numDesordenados) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        ordenarArrayMa(numDesordenados);
        System.out.println("\nDespues:");
        for (int i : numDesordenados) {
            System.out.print(i + " ");
        }
        //Arrays.sort(numDesordenados);
        /*
          for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
          }
         */
    }

    /**
     * Metodo para ordeanr el array de menor a mayor
     * @param num array donde se haran los cambios
     */
    public static void ordenarArrayMa(int num[]){
        int tmp = 0;
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] > num[j]){
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
            
        }
    }
    
    /**
     * Metodo para ordenar el array de mayor a menor
     * @param num array donde se haran los cambios
     */
    public static void ordenarArrayMm(int num[]){
        int tmp = 0;
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] < num[j]){
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
            
        }
    }
    



}