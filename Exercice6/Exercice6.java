package Exercice6;
public class Exercice6{
    public static int median(int[] arr){
        int[] sortedArr = arr.clone();


        for(int i = 0 ; i<arr.length ; i++){
            int maxIndex = i;
            for(int j = i+1 ; j<arr.length  ; j++){
                if(sortedArr[j]>sortedArr[maxIndex]){
                    maxIndex=j;

                }
            };
            int tempVal = sortedArr[i];
            sortedArr[i] = sortedArr[maxIndex];
            sortedArr[maxIndex] = tempVal;


        };
        return sortedArr[arr.length/2];
    }
    public static void main(String[] args){
        int[] arr1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int m1 = median(arr1);
        System.out.println(m1);
        int[] arr2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        int m2 = median(arr2);
        System.out.println(m2);
    }
}