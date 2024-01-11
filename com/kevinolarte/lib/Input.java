package com.kevinolarte.lib;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo para pedir un numero Real positivo
     * @param mensaje mensaje que mostrara, por defecto pon " ".
     * @return devuelve el num real ingresado.
     */
    public static String pedirString(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa algo " : mensaje;
        System.out.println(mensaje);
        ingreso = scanner.nextLine();
        
        return ingreso;
    }

    /**
     * Metodo para pedir un numero Real positivo
     * @param mensaje mensaje que mostrara, por defecto pon " ".
     * @return devuelve el num real ingresado.
     */
    public static double pedirDoublePositivo(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa un numero real entero" : mensaje;

        double resultado = 0;
        do{
            System.out.println(mensaje);
            ingreso = scanner.nextLine();
            if (!Comprobate.comprobarNumerRealPositivo(ingreso))
                continue;
            break;
        }while(true);
        resultado = Double.parseDouble(ingreso);

        return resultado;
    }

    /**
     * Metodo para pedir un numero entero, positivo o negativo
     * @param mensaje mensaje que se imprime para el ingreso, " " para el por defecto
     * @return devuelve el ingreso del numero Int
     */
    public static int pedirInt(String mensaje){
        String ingreso = "";
        mensaje = mensaje == " " ? "Ingresa un numero entero, positivo o negativo." : mensaje; 
        int resultado = 0;

        do{
            System.out.println(mensaje);
            ingreso = scanner.nextLine();
            if (!Comprobate.comprobarNumeroEntero(ingreso))
                continue;
            break;
        }while(true);
        resultado = Integer.parseInt(ingreso);

        return resultado;
    }

}
