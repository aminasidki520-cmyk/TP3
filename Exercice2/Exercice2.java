package Exercice2;
import java.util.Arrays;
public class Exercice2{
    public static void reverse(int[] arr){

        for(int i = 0 ; i<arr.length ; i++){
            System.out.println("Element "+ i + "Content "+ arr[i]);


        };
        for(int i = 0; i<(arr.length)/2 ; i++){
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i -1]= t;

        };
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println("Element "+ i + "Content "+ arr[i]);


        };

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverse(arr);
    }
}