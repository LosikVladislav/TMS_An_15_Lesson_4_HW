import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sizeOfArr = in.nextInt();
        //first array
        int[] arrayFirst = new int[sizeOfArr];
        System.out.println("first array");
        for (int i = 0; i < arrayFirst.length; i ++){
            arrayFirst[i]=(int)(Math.random()*sizeOfArr);
            System.out.print(" " +arrayFirst[i]);
        }
        System.out.println("\n");
        //second array
        int[] arraySecond = new int[sizeOfArr];
        System.out.println("second array");
        for (int i = 0; i < arraySecond.length; i ++){
            arraySecond[i]=(int)(Math.random()*sizeOfArr);
            System.out.print(" " +arraySecond[i]);
        }
        System.out.println("\n");
        int sumFirst = 0;
        int sumSecond = 0;
        double avrFirst;
        double avrSecond;
        //average first array
        for(int i = 0; i < arrayFirst.length; i++){
            sumFirst += arrayFirst[i];
        }
         avrFirst = (double) sumFirst/arrayFirst.length;
        //average second array
        for(int i = 0; i < arraySecond.length; i++){
            sumSecond += arraySecond[i];
        }
        avrSecond = (double)sumSecond/arraySecond.length;

        if(avrFirst>avrSecond){
            System.out.println("the average of the first array is greater");
        }else if(avrFirst<avrSecond){
            System.out.println("the average of the second array is greater");
        }else if(avrFirst==avrSecond){
            System.out.println("the average of two arrays are equal");
        }
    }
}
