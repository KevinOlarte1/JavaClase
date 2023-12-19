package com.kevinolarte.ejercicioios.tema06;
import com.kevinolarte.lib.Arrayss;
public class Ejer19 {
    /**
     * 
     */
    public Ejer19(){ 
        int [] nums = new int[100];
        Arrayss.randomArray(nums, 100);
        
        int [] resultado10 = new int[cantidadNumeroArrayMultiplosNumeroIndicado(nums, 10)];
        int [] resultado5 = new int[cantidadNumeroArrayMultiplosNumeroIndicado(nums, 5)];
        int [] resultado0 = new int[cantidadNumeroArrayMultiplosNumeroIndicado(nums, 0)];
        resultado10 = multiplo(nums, 10);
        resultado5 = multiplo(nums, 5);
        resultado0 = multiplo(nums, 0);
        
        System.out.println("Multiplos de 5");
        for (int i : resultado5) {
            System.out.println(i);
        }

        System.out.println("Multiplos de 10");
        for (int i : resultado10) {
            System.out.println(i);
        }

        System.out.println("Iguales a 0");
        for (int i : resultado0) {
            System.out.println(i);
        }
    }

    /**
     * Metodo para encotrar los numeros que son multiplo de ese numero
     * @param lista
     * @param reoetir
     * @return
     */
    public static int cantidadNumeroArrayMultiplosNumeroIndicado(int[] lista, int multiplo){
        int cont = 0;
        if (multiplo == 0) {
            for (int i : lista) {
                if (i == 0) {
                    cont ++;
                }
            }
            return cont;
        }

        for (int i : lista) {
            if (i % multiplo == 0) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Comprobar num que sea multiplo de un numero
     * @param nums array por dodne se vera los ingresos
     * @param num numero a comprobar
     */
    public static int[] multiplo(int[] nums, int num){
        int cont  = 0;
        int [] resultado = new int[cantidadNumeroArrayMultiplosNumeroIndicado(nums, num)];
        if (num == 0) {
            for (int i : nums) {
                if (i == 0) {
                    resultado[cont] = i;
                    cont++;
                }
            }
            return resultado;
        }
        for (int i : nums) {
            if (i % num == 0) {
                resultado[cont] = i;
                cont++;
            }
        }
        
        return resultado;
        
    }
}
