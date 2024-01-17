//import com.kevinolarte.lib.Arrayss;
//import com.kevinolarte.lib.Input;
//import com.kevinolarte.lib.Matriz;
import java.text.DecimalFormat;

import com.kevinolarte.lib.Randoms;
public class Pruebas {
   public static void main(String[] args) {
        
        do{
            System.out.println(Float.parseFloat( new DecimalFormat("#.##").format(Randoms.rnd.nextFloat() * 2)));
                
            
        }while(true);
        
   }
   public static void seleccion(int nums[]){
    int max = Integer.MAX_VALUE;
    int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < max) {
                    tmp = j;
                    max = nums[j];
                }
            }
            nums[tmp] = nums[i];
            nums[i] = max;
            max = Integer.MAX_VALUE;
            
        }
   }
   public static void insert(int nums[]){
        for (int i : nums) {
            System.out.print( " " + i + " ");
        }
        System.out.println(" ");
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("s");
                
            }
            System.out.println(" ");
        }
        for (int i : nums) {
            System.out.print( " " + i + " ");
        }
   }

}
