import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args){
        System.out.println("Enter the size of array");
        Scanner scanner = new Scanner(System.in);
        int sizeOfArr = scanner.nextInt();
        int[] array = new int[sizeOfArr];
        for(int i = 0; i < array.length; i++){
            array[i]=(int)(Math.random()*sizeOfArr);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("enter the num");
        int numResult = scanner.nextInt();
        int duplicateNumbers=0;
        for(int i =0; i < array.length; i++){
            if(array[i]==numResult){
                duplicateNumbers += 1;
            }
        }
        int[] resulArray = new int[sizeOfArr-duplicateNumbers];
        int j = numResult;
        for (int i =0, k = 0; i < array.length; i++){
            if(array[i]!=j){
                resulArray[k]=array[i];
                k++;
            }

        }
        System.out.println(Arrays.toString(resulArray));
    }

}
