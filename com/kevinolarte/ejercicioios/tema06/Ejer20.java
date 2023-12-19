package com.kevinolarte.ejercicioios.tema06;
import com.kevinolarte.lib.Arrayss;
public class Ejer20 {
    
    public Ejer20(){
        int [] nums = new int[100];
        int buscar = 34;

        Arrayss.randomArray(nums, 100);

        System.out.println(encontrarNumArray(nums, buscar));
    }

    /**
     * Compromar si un numero esta en un array
     * @param nums array donde se va buscar el numero
     * @param num numero que buscaremos
     * @return devuelve un boolena a ver si se ha encontrado.
     */
    public static boolean encontrarNumArray(int[] nums, int num){

        for (int i : nums) {
            if (i == num) {
                return true;
            }
        }
        return false;

    }
}
