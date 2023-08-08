import java.sql.Array;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int sizeOfArr = in.nextInt();
        int[] array = new int[sizeOfArr];
        int max = array[0];
        int min = array[0];
        int sum =0;
        //array output
        for(int i = 0; i < array.length; i++){
            array[i]=((int)(Math.random()*sizeOfArr));
            System.out.println(" " + array[i]);
        }
        //max num
        for(int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        // min num
        for(int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        // average mas
        for(int i = 0; i < array.length; i++){
           sum += array[i];

        }
        System.out.println("The maximum number in the array " + max);
        System.out.println("The minimum number in the array " + min);
        System.out.println("The average in the array " + sum/array.length);
    }
}
