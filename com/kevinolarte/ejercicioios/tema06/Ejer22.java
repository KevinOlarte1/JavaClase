package com.kevinolarte.ejercicioios.tema06;
import com.kevinolarte.lib.*;
public class Ejer22 {

    public static final int LIMT_VALOR_PREDEFINIDO = 10;

    /**
     * Mostrar en un array nuevo los numeros menores de 10 y los mayores se reprsentaran con -1 en un array nuevo
     */
    public Ejer22(){
        int[] P = new int[LIMT_VALOR_PREDEFINIDO];
        int[] S = new int[LIMT_VALOR_PREDEFINIDO];
        Arrayss.randomArray(P, 30);
        for (int i = 0; i < S.length; i++) {
            if (P[i] > 10) 
                S[i] = P[i];
            else
                S[i] = -1;
        }
        
        System.out.printf("ANTERIOR \t NUEVO \n");
        for (int i = 0; i < S.length; i++) {
            System.out.printf("%-9d \t %-9d \n", P[i],S[i]);
        }
    }
}
