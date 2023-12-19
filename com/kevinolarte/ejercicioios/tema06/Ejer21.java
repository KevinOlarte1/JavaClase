package com.kevinolarte.ejercicioios.tema06;

import com.kevinolarte.lib.Randoms;
import com.kevinolarte.lib.Input;

public class Ejer21 {
    
    public Ejer21(){
        int num = 0;
        int[] nums = new int[50];
        String ingreso  ="";
        do{
            menu();
            ingreso = Input.scanner.nextLine();
            if (!ingreso.matches("\\d+")) 
                continue;
            num = Integer.parseInt(ingreso);
            if (num < 0 || num > 4) {
                continue;
            }
            switch (num) {
                case 1:
                    crearArray(nums);
                    break;
            
                case 2:
                    visualitzarArray(nums);
                    break;
                case 3:
                    visualitzarParell(nums);
                    break;
                case 4:
                    visualitzarMultiple3(nums);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
            System.out.println("Continuar....");
            Input.scanner.nextLine();
            
        }while(num != 0);
    }

    /**
     * Mostar el menu
     */
    public static void menu(){
        System.out.println("""
            \033[H\033[2J
            MENÚ PRINCIPAL
            ==============
            1.-Rellenar array.
            2.-Visualizar contenido del array
            3.-Visualizar contenido par.
            4.-Visualizar contenido múltiplo de 3
            0.-Salir del menú.
                """);
    }
    /**
    * Genera numeros aleatorios del 0 al 50 en un array en un metodo
    */
    public static void crearArray(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Randoms.rnd.nextInt(0, 50);
        }
    }
    /**
     * Metodo para visualizar el contenido de un array.
     * @param vector el array que mostraremos
     */
    public static void visualitzarArray(int[] vector){
        for (int i : vector) {
            System.out.println(i);
        }
    }

    /**
     * Metodo para mostar los valores pares de un array y su posición.
     * @param vector el array dodne sacaremos la info
     */
    public static void visualitzarParell(int[] vector){
        for (int i : vector) {
            if (i % 2 == 0) {
                System.out.printf("Num: %2d con la posición: %d \n", vector[i], i);
            }
        }
    }

    /**
     * Metodo para mostar los valores que son multiplos de 3 de un array y su posición.
     * @param vector el array dodne sacaremos la info
     */
    public static void visualitzarMultiple3(int[] vector){
        for (int i : vector) {
            if (i % 3 == 0) {
                System.out.printf("Num: %2d con la posición: %d \n", vector[i], i);
            }
        }
    }
}
