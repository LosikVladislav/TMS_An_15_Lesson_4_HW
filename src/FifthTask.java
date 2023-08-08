import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.sun.nio.sctp.AssociationChangeNotification.AssocChangeEvent.RESTART;


public class FifthTask {
    public static void main(String[] args) {

        getEvenNumbers();

    }

    public static void getEvenNumbers() {
        int sizeOfArr = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        if (scanner.hasNextInt()) {
            sizeOfArr = scanner.nextInt();
        } else  {
            System.out.println("error of input");
            getEvenNumbers();
            return;
        }
        int[] array = new int[sizeOfArr];
        for (int i = 0; i < array.length; i++){
            array[i]=(int)(Math.random()*sizeOfArr);
        }
        System.out.println(Arrays.toString(array));

        int duplicateNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==0 && array[i]!=0){
                duplicateNumber+=1;
            }
        }
        int[] arrayResult = new int[duplicateNumber];
        for(int i = 0, k = 0; i < array.length; i++){
            if(array[i]%2==0 && array[i]!=0){
                arrayResult[k]=array[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arrayResult));
    }

}
