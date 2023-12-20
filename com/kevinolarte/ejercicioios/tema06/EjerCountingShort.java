package com.kevinolarte.ejercicioios.tema06;

import com.kevinolarte.lib.Arrayss;

public class EjerCountingShort {
    public EjerCountingShort(){
        int nums[] = new int[30];

        Arrayss.randomArray(nums, 30);
        System.out.println("Antes: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        

        
        int numReps[] = Arrayss.ArrayOrdenadorCont(nums, 31);

        System.out.println("Desp: ");
        for (int i = 0; i < numReps.length; i++) {
            for (int j = 1; j <= numReps[i]; j++) {
                System.out.print(i + " ");
            }
        }
        
        
        
    }
}
