package com.kevinolarte.lib;

import java.util.Random;

public class Arrayss {
    
    /**
     * Generar numeros Random para un array.
     * @param array array donde se generara los numeros random
     */
    public static void randomArray(int[] array, int num){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1, num); 
        }
    }

    /**
     * Metodo para visualizar el contenido de la lista de enteros int
     * @param lista
     */
    public static void visualitzarArrayInt(int [] lista){
        for (int i : lista) {
            System.out.println(i);
        }
    }

    /**
     * Metodo para añdir valores random a u array te tipo int
     * @param array array donde se le podra los valores
     * @param min valor minimo del ingreso en el array
     * @param max valor maximo del ingreso en el array
     */
    public static void randomArrayEnteros(int [] array, int min, int max){
        for (int i = 0; i < array.length; i++) {
            array[i] = Randoms.rnd.nextInt(min, max);
        }
    }
    /**
     * Metodo para obtener un array contando las veces que toca el num 
     * @param nums array dodne se buscara los numeros
     * @param max numero maximo que puede tener el array.
     * @return array con las veces que se repite un numero.
     */
    public static int[] ArrayOrdenadorCont (int nums[], int max){
        int numReps[] = new int[max];
        for (int i : nums) {
            numReps[i]++;
        }
        return numReps;
    }
}
