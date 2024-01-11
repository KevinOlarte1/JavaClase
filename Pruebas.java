import com.kevinolarte.lib.Arrayss;
import com.kevinolarte.lib.Input;
import com.kevinolarte.lib.Matriz;
public class Pruebas {
   public static void main(String[] args) {
        int nums[][] = new int[4][3];
        
        System.out.println(nums[0].length);
        
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
     int tmp = 0;
        int tmp1 = 0;
        boolean mover = false;
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
