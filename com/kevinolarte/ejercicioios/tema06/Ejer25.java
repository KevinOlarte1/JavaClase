package com.kevinolarte.ejercicioios.tema06;

import com.kevinolarte.lib.Arrayss;

public class Ejer25 {

    
    //Apartir de un array generar otro con sus pares y mostrarlos por pantalla  
    public Ejer25(){
        int[] nums = new int[50];
        Arrayss.randomArray(nums, 50);
        int[] numPares = new int[cantidadParesArray(nums)];

        numPares = arrayConPares(nums);
        if (numPares == null) {
            System.out.println("El array donde se busca no contiene numeros pares");
        }
        else{
            System.out.print("Nums Pares: ");
            for (int i : numPares) {
            System.out.print(i + " ");
        }
        }
        
    }
    
    
    /**
     * Metodo que devuelve un array con los nuemros pares de otro array
     * @param nums array onde se busca
     * @return un array con los numeros pares
     */
    public static int[] arrayConPares(int[] nums){
        int[] numPares = new int[cantidadParesArray(nums)];
        int cont = 0;
        for (int i : nums) {
            if (i % 2 == 0){
                numPares[cont] = i;
                cont++;
            }

        }
        
        return numPares;
    }

    /**
     * Metodo para contar la cantidad de numeros pares de un Array
     * @param nums array onde se busca
     * @return la cantidad de pares
     */
    public static int cantidadParesArray(int[] nums){
        int res = 0;
        for (int i : nums) {
            if(i % 2 == 0)
                res++;
        }
        return res;
    }
}
