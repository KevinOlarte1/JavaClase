package com.kevinolarte.ejercicioios.tema06;

import com.kevinolarte.lib.Arrayss;
import com.kevinolarte.lib.Matriz1;

public class Ejer27 {
    public Ejer27(){
        int v[] = new int[50];
        int p[] = new int[20];
        Arrayss.randomArray(p, 5);
        Arrayss.randomArray(v, 5);
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("---------");
        for (int i : p) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("----------");
        
        int m[][] = new int[50][20];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = p[j]* v[i];
            }
        }

        Matriz1.print(m);
    }
}
