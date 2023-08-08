import java.util.Arrays;
import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sizeOfArr = in.nextInt();
        int[] array = new int[sizeOfArr];
        for (int i =0; i < array.length; i++){
            array[i]=(int)(Math.random()*sizeOfArr);
            System.out.print(" " + array[i]);
        }
        System.out.println("\n");

        for (int i = 0; i < array.length; i++){
            if(i%2==1){
                array[i]=0;
            }
        }
        System.out.println("modified array" + Arrays.toString(array));
    }
}
