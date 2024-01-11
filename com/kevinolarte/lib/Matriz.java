package com.kevinolarte.lib;

public class Matriz {
    /**
     * Rellenar una matriz con numeros random
     * @param matriz matriz a rellenar
     * @param min valor Minimo a rellenar
     * @param max valor Maximo a rellenar
     */
    public static void rellenarMatriz(int[][] matriz, int min, int max){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Randoms.rnd.nextInt(min, max);
            }
        }
    }

    /**
     * Metodo para visualizar una matriz de numeros enteros
     * @param matriz matriz que se imprimira
     */
    public static void verMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
    /**
     * Metodo para crear un string donde mostrar una matruz por filas.
     * @param matriz matriz a mostrar
     * @return devuelve una matriz por filas.
     */
    public static String verMatrizPorFilas(int matriz[][]){
        String visual= "";
        for (int i = 0; i < matriz.length; i++) {
            visual += "Fila " + i + ": ";
            for (int j = 0; j < matriz[i].length; j++) {
                visual += matriz[i][j] + " ";
            }
            visual += "\n";
        }
        return visual;
    }

    /**
     *  Metodo para crear un string donde mostrar una matruz por columnas.
     * @param matriz matiz a mostar
     * @return devuelve una matriz por columnas
     */
    public static String verMatrizPorColumnas(int matriz[][]){
        String visual = "";
        for (int i = 0; i < matriz[0].length; i++) {
            visual += "Columna " + i + ": ";
            for (int j = 0; j < matriz.length; j++) {
                visual += matriz[j][i] + " ";
            }
            visual += "\n";
        }
        return visual;
    }
    /**
     * Metodo para ver el valor total por filas
     * @param matriz
     * @return
     */
    public static String valorTotalPorFilas(int matriz[][]){
        String visual = "";
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            visual += "Fila " + i + ": ";
            sum = valorTotalFila(matriz, i);
            visual += sum;
            visual += "\n";
            sum = 0;
        }
        return visual;
    }

    /**
     * metodo para devilver el valor total de una fila de una matriz
     * @param matiz matriz de donde sumara los valores
     * @param fila fila donde se sumara los valores
     * @return la suma de la fila.
     */
    public static int valorTotalFila(int matiz[][], int fila){
        int sum = 0;
        for (int i = 0; i < matiz[fila].length; i++) {
            sum += matiz[fila][i];
        }
        return sum;
    }

    /**
     * Metodo para sacar el valor minimo de un a matriz
     * @param matriz matriz donde se buscara
     * @return valir min de la matriz
     */
    public static int valorMinimoMatriz(int matriz[][]){
        int min = Integer.MAX_VALUE;
        for (int[] is : matriz) {
            for (int x : is) {
                if(x < min)
                    min = x; 
            }
        }
        return min;
    }

    /**
     * Metodo para sacar el valor maximo de un a matriz
     * @param matriz matriz donde se buscara
     * @return valir max de la matriz
     */
    public static int valorMaximoMatriz(int matriz[][]){
        int max = Integer.MIN_VALUE;
        for (int[] is : matriz) {
            for (int x : is) {
                if(x > max)
                    max = x; 
            }
        }
        return max;
    }

    /**
     * Metodo para sacar la media de los valores de una matriz
     * @param matriz matriz donde se sacaran los valores
     * @return devuelve la media de la matriz
     */
    public static double valorMediaMatriz(int matriz[][]){
        int sum = 0;
        int cont = 0;
        for (int[] x : matriz) {
            for (int x1 : x) {
                sum += x1;
                cont++;
            }
        }                       //  ------------cont-------------
        return ( (double)sum / (matriz.length * matriz[0].length) );
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
        
        if (fila < 0 || fila >= matriz.length) 
            return "Error!";
        visual += "Fila " + fila + ": ";
        for (int i = 0; i < matriz[fila].length; i++) {
           visual += matriz[fila][i] + " ";
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
        visual += "Columna " + columna + ": ";
        for (int i = 0; i < matriz.length; i++) {
            visual += matriz[i][columna] + " ";
        }
        return visual;
    }

    

}
