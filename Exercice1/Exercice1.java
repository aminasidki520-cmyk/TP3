package Exercice1;
import java.util.Arrays;
public class Exercice1{
    public static void printArray(int[] arr){
        System.out.println("the element of the Array : ");
        for(int i = 0 ; i<arr.length ; i++ ){
            System.out.println("Element  "+i+" contents "+arr[i]+ " \n");
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] sortedArr = new int[arr.length];

        for(int i = 0 ; i<arr.length ; i++){
            int max = arr[i];
            for(int j = i+1 ; j<arr.length  ; j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            };
            sortedArr[i] = max;
        };
        return sortedArr;
    }
    public static void main(String[] args ){
        int[] arr = {106,26,81,5,15};
        System.out.println("the array :");
        printArray(arr);
       int[] sortedArr= sortIntegers(arr);
       System.out.println("the array sorted : ");
       printArray(sortedArr);
    }

}