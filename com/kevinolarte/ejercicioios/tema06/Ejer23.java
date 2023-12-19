package com.kevinolarte.ejercicioios.tema06;

import com.kevinolarte.lib.Arrayss;

public class Ejer23 {
    public static final int LIMT_VALOR_PREDEFINIDO = 10;

    /**
     * De un array de 10 long genenrar otro al inversio
     */
    public Ejer23(){
        int [] nums = new int [LIMT_VALOR_PREDEFINIDO];
        int [] reves =  new int [LIMT_VALOR_PREDEFINIDO];
        
        Arrayss.randomArray(nums, 30);

        reves = arrayReves(nums);

        System.out.printf("ANTERIOR \t NUEVO \n");
        for (int i = 0; i < reves.length; i++) {
            System.out.printf("%-9d \t %-9d \n", nums[i], reves[i]);
        }
    }
    /**
     * Metodo para genenerar un array inversio del orignial
     * @param origen array origen de partir
     * @return array inverso del origen
     */
    public static int[] arrayReves(int[] origen){
        int[] reves = new int[origen.length];
        for (int i = 0; i < origen.length; i++) {
            reves[origen.length-i] = origen[i];
        }
        return reves;
    }
}
