package com.kevinolarte.ejercicioios.tema06;

import com.kevinolarte.lib.Arrayss;

public class Ejer24 {
    
    /**
     * Metodo donde genera un array con la suma de sus anteriores posiciones
     */
    public Ejer24(){
        int [] numV = new int[50];
        int [] numP = new int[50];
    
        Arrayss.randomArray(numV, 50);
        for (int i = 0; i < numV.length; i++) {
            numP[i] = sumaArrayHasta(numV, i);
            System.out.println(numP[i]);
        }
        
    }

     /**
     * Suma de los valores anteriores de un array hasta el indicado
     * @param array donde se cogeran los numeros
     * @param limit limitnate a parar
     * @return
     */
    public static int sumaArrayHasta (int[] array, int limit){
        int num = 0;
        for (int i = 0; i <= limit; i++) {
            num += array[i];
            
        }
        return num;

    }
}
