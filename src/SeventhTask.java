import java.util.Arrays;
import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sizeOfArr = in.nextInt();
        String[] array = new String[sizeOfArr];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter the " + (i+1) +"-th element of the array");
            array[i] = in.next();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
