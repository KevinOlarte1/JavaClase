package com.kevinolarte.ejercicioios.tema06;
import com.kevinolarte.lib.Arrayss;

public class Ejer18 {

    /*
     * Ejercicio18, trata de sumar 2 array y devolver el resultado en otro array 
     */
    public Ejer18(){
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        int[] resultado = new int[10];
        Arrayss.randomArray(lista1, 10);
        Arrayss.randomArray(lista2, 10);

        resultado = sumaArray(lista1, lista2);
        for (int i : resultado) {
            System.out.println(i);
        }
        resultado = dividirArray(lista1, lista2);
        for (int i : resultado) {
            System.out.println(i);
        }
    }

    /**
     * Metodo para dividir arrays y el resultado lo devuelve en otro
     * @param lista1 dividiendo
     * @param lista2 divisor
     * @return  resultado de la visión en un array
     */
    public static int[] dividirArray(int[] lista1, int[] lista2){
        int [] resultado = new int[10];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = lista1[i] / lista2[i];
        }
        return resultado;
    }

    /**
     * Metodo para sumar array y lo devuelve en otro
     * @param lista1 primer array a sumar
     * @param lista2 segundo array a sumar
     * @return devuelve la suma de los dos arrays
     */
    public static int[] sumaArray(int[] lista1, int[] lista2){
        int [] resultado = new int[10];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = lista1[i] + lista2[i];
        }
        return resultado;
    }

    
    //#endregion
}