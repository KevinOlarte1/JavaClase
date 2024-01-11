package com.kevinolarte.lib;


public class Matriz1 {
    /**
     * Metodo para imprimir la matriz. (Nos da pereza de escribir System....)
     * @param matriz matriz que se mostrara
     */
    public static void print(int matriz[][]){
        System.out.println(string(matriz));
    }

    /**
     * Metodo para pasar de una matriz a string.
     * @param matriz matriz donde se sacaran los valores
     * @return devolvela la matriz en string
     */
    public static String string(int matriz[][]){
        int longs = Math.max(String.valueOf(valorMax(matriz)).length(), String.valueOf(valorMin(matriz)).length()); //Metodo para obtener el numero mas largo de ocupación
        String matrizv = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizv += String.format("%" + longs +"d ", matriz[i][j]);
            }
            matrizv += String.format("\n");
        }
        return matrizv;
    }

    /**
     * Metodo para obtener el valor minimo de una Matriz
     * @param matriz matriz donde se buscaran el numero
     * @return numero con valor minimo de la matriz
     */
    public static int valorMin(int matriz[][]){
        int min = matriz[0][0];
        for (int[] x : matriz) {
            for (int x1 : x) {
                if (x1 < min) 
                    min = x1;
                
            }
        }
        return min;
    }

    /**
     * Metodo para obtener el valor maximo de una Matriz
     * @param matriz matriz donde se buscaran el numero
     * @return numero con valor maximo de la matriz
     */
    public static int valorMax(int matriz[][]){
        int max = matriz[0][0];
        for (int[] x : matriz) {
            for (int x1 : x) {
                if (x1 > max) 
                    max = x1;
                
            }
        }
        return max;
    }

    /**
     * Metodo para sacar la media de los valores de una matriz
     * @param matriz matriz donde se sacaran los valores
     * @return devuelve la media de la matriz
     */
    public static double valorMedia(int matriz[][]){
        if (!regular(matriz)) 
            return 0.0;
        int sum = 0;
        sum = sumTotal(matriz);                      //  ------------cont-------------
        return ( (double)sum / (matriz.length * matriz[0].length) );
    }

    /**
     * Valor total de la matriz;
     * @param matriz matriz donde se sacaran los numeros
     * @return valor total.
     */
    public static int sumTotal(int matriz[][]){
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
        }
        return sum;
    }

    /**
     * Metodo para devolver la matriz traspuesta columnas por filas y filas por columnas
     * @param matriz matriz donde se sacaran los numeros
     * @return matriz traspuesta
     */
    public static int[][] traspuesta(int[][] matriz){
        int matrizTras[][] = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTras[j][i] = matriz[i][j];
            }
        }

        return matrizTras;
    }

    /**
     * Obtener un array con los totales de las filas de una matriz
     * @param matriz matriz donde sacare los valores
     * @return devuelve un array con los valores totales de las filas de la matriz
     */
    public static int[] arraySumFilas(int matriz[][]){
        int nums[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            nums[i] = valorTotalSumaFila(matriz, i);
        }
        return nums;
    }
    /**
     * Obter valor total de una fila especifica
     * @param matriz donde se sacaran los valores
     * @param fila fila que seleccionaremos
     * @return valor total de la fina de la matriz
     */
    public static int valorTotalSumaFila(int matriz[][], int fila){
        int sum = 0;
        for (int i = 0; i < matriz[fila].length; i++) {
            sum += matriz[fila][i];
        }

        return sum;
    }

    /**
     * Saber si una matriz es regular
     * @param matriz matriz qeu se observara
     * @return booleano.
     */
    public static boolean regular(int matriz[][]){
        for (int i = 0; i < matriz.length-1; i++) {
            if (matriz[i].length != matriz[i+1].length) 
                return false;
            
        }
        return true;
    }

    /**
     * Metodpa para encontrar un valor en una posicion en especifico
     * @param matiz matriz donde se buscara
     * @param x eje x de la matriz
     * @param y eje y de la matriz
     * @return devuelve el valor donde buscamos.
     */
    public static int econctarValorMatirz(int matiz[][], int x, int y){

        if (x < 0 || y < 0 || x >= matiz[0].length || y >= matiz.length) 
            return Integer.MIN_VALUE;

        return matiz[y][x];
    }

    /**
     * Metodo para mostrar los valores de una fila en concreta
     * @param matriz matriz donde se sacara la fila
     * @param fila la fila a buscar
     * @return valores de la fila.
     */
    public static String verFilaSelecionadaMatriz(int matriz[][], int fila){
        String visual = "";
        int nums[] =arrayFilaSelect(matriz, fila);
        if (fila < 0 || fila >= matriz.length) 
            return "Error!";
        visual += "Fila " + fila + ": ";
        for (int i = 0; i < nums.length; i++) {
           visual += nums[i] + " ";
        }
        return visual;
    }

    /**
     * Metodo para mostrar los valores de una columna en concreta
     * @param matriz matriz donde se sacara la fila
     * @param fila la fila a buscar
     * @return valores de la fila.
     */
    public static String verColumnaSelecionadaMatriz(int matriz[][], int columna){
        String visual = "";

        if (columna < 0 || columna >= matriz[0].length) 
            return "Error!";
        int nums[] = arrayColumnaSelect(matriz, columna);
        visual += "Columna " + columna + ": ";
        for (int i = 0; i < nums.length; i++) {
            visual += nums[i] + " ";
        }
        return visual;
    }

    /**
     * Metodo para crear un arrray con una fiual de una matriz
     * @param matriz
     * @param fila
     * @return
     */
    public static int[] arrayFilaSelect(int matriz [][], int fila){
        if (fila < 0 || fila > matriz.length) 
            return null;
        int nums [] = new int[matriz[fila].length];
        for (int i = 0; i < matriz[fila].length; i++) {
            nums[i] = matriz[fila][i];
        }
        return nums;
    }

    /**
     * Metodo para crear un arrray con una fiual de una matriz
     * @param matriz
     * @param fila
     * @return
     */
    public static int[] arrayColumnaSelect(int matriz [][], int columna){
        if (columna < 0 || columna > matriz[0].length) 
            return null;
        int nums [] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            nums[i] = matriz[i][columna];
        }
        return nums;
    }


    
    
}
