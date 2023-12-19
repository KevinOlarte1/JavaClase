package com.kevinolarte.lib;

public class Comprobate {
     /**
     * Metodo para comprobar si tiene algun caracter que no sea un numero.
     * @param palabra palabra a comprobar si tiene caracter
     * @return devuelve un booleano comprobando si tiene algun caracter.
     */
    public static boolean contieneCaracteres(String palabra){
        boolean verdad = palabra.matches("\\d+");
        return verdad;
    }

    /**
     * Metodo para verificar si es un numero entero, positivo o negativo
     * @param palabra palabra a comprobar si tiene caracter
     * @return devuelve un booleano comprobando si es un numero entero
     */
    public static boolean comprobarNumeroEntero(String palabra){
        boolean verdad = palabra.matches("-?\\d+");
        return verdad;
    }

    /**
     * Metodo para comprobar si el string es un numbero real positivo
     * @param palabra palabra a comprobar 
     * @return devuelve un booleano, comprobando si cumple la codición
     */
    public static boolean comprobarNumerRealPositivo(String palabra){
        boolean verdad = palabra.matches("\\d*.\\d+");
        return verdad;
    }

}
