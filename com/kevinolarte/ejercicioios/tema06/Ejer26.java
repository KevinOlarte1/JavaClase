package com.kevinolarte.ejercicioios.tema06;
import com.kevinolarte.lib.Input;
import com.kevinolarte.lib.Matriz;
import com.kevinolarte.lib.Matriz1;
public class Ejer26 {
    public Ejer26(){
        String palabra;
        int x = 0, y = 0;
        int matriz[][] = new int[4][8];
        Matriz.rellenarMatriz(matriz, 1, 30);
        
        // A----------------
        palabra = Matriz1.string(matriz);
        System.out.println("a) Toda la Matriz (por Filas)" + "\n \n" + palabra + "\n");
        
        // B----------------
        int matrizTrasp[][] = traspuesta(matriz);
        palabra = Matriz1.string(matrizTrasp);
        System.out.println("b) La matriz traspuesta (por columnas)" + "\n \n" + palabra + "\n");

        // C----------------
        int matrizTotalFila[][] = matrizValoresFila(matrizTrasp);
        
        palabra = Matriz1.string(matrizTotalFila);
        System.out.println("c) La matriz por filas con la suma total de cada fila " + "\n \n" + palabra + "\n");
        
        // D----------------
        System.out.println("d) Los valores máximo y mínimo de la matriz" + "\n \n" + "Valor minimo: " + Matriz1.valorMin(matriz) + "\n" + "Valor maximo: " + Matriz1.valorMax(matriz) + "\n");
        
        // E----------------
        System.out.println("e) La media total de la matriz " + "\n \n" + "Valor medio: " + Matriz1.valorMedia(matriz) + " \n");
        
        
        // F----------------
        System.out.println("f) El elemento que nos indique el usuario" + "\n");
        y = Input.pedirInt("Dime la fila");
        x = Input.pedirInt("Dime la columna");
        System.out.println(Matriz1.econctarValorMatirz(matriz, x, y));
        
       
        // G----------------
        System.out.println("g) La fila que nos indique el usuario" + "\n");
        y = Input.pedirInt("Dime la fila"); 
        System.out.println(Matriz1.verFilaSelecionadaMatriz(matriz, y) + "\n");
         
        // H----------------
        System.out.println("h) La columna que nos indique el usuario" + "\n");
        y = Input.pedirInt("Dime la columna");
        System.out.println(Matriz1.verColumnaSelecionadaMatriz(matriz, y) + "\n");
        
        System.out.println("i) Guardar en la columna 8 el total de todas las anteriores. \n \n");
        Matriz1.print(matriz);
        matriz = matrizValoresFila(matriz);
        Matriz.verMatriz(matriz);
        
    }
    /**
     * Metodo para crear una matriz con al final el valor total de las filas
     * @param matriz matriz donde se sacan los datos
     * @return una matriz nueva con las sumas de las filas.
     */
    public static int[][] matrizValoresFila(int matriz[][]){
        if (!Matriz1.regular(matriz)) 
            return null;
        int matrizN[][] = new int[matriz.length][matriz[0].length];
        int totalFila[] = Matriz1.arraySumFilas(matriz);
        for (int i = 0; i < matrizN.length; i++) {
            for (int j = 0; j < matrizN[i].length-1; j++) {
                matrizN[i][j] = matriz[i][j];
            }
            matrizN[i][matrizN[0].length-1] = totalFila[i];
        }
        return matrizN;
        
    }
    /**
     * Metodo para crear una matriz traspuesta a partir de otra matriz
     * @param matriz matriz que se movera a una nueva
     * @return matriz traspiuesta
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
    /* 
    public static void guardarTotalColumnaFinal(int matriz[][]){
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(j == matriz[i].length -1){
                    matriz[i][j] = sum;
                }
                else{
                    sum += matriz[i][j];
                }
            }
            sum = 0;

        }
    } */
}
