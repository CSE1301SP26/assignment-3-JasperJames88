
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your array?");
        int length = input.nextInt();
        int[]arr = new int[length];
        for (int i=0;i<arr.length;i++){
            System.out.println("This is the number you are printing for the "+i+"index of the array");
            arr[i]=input.nextInt();
    }   
    System.out.println(Arrays.toString(arr));
    for (int i=0; i<arr.length;i++){
        for (int j=1; j<=arr.length-i-1;j++){
            if (arr [j-1] >arr [j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                

 

            }

        }
        

    }
    System.out.println(Arrays.toString(arr));

}
}