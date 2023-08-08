import java.util.Arrays;
import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i < array.length; i++ ){
            System.out.print(" " + array[i]);
        }
        System.out.println("\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        if(Arrays.stream(array).anyMatch(s-> s==num)){
            System.out.println("your number is in the array");
        }else{
            System.out.println("your number is not in the array");
        }
    }
}
