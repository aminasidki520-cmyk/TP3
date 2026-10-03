package Exercice7;
public class Exercice7{
    public static double stdev(int[] arr){
        double average = 0;
        for(int i = 0 ; i<arr.length ; i++){
            average+=arr[i];
        };
        average = average/arr.length;
        double stdev = 0;
        for(int i = 0 ;i<arr.length ; i++){
            stdev +=(arr[i]-average)*(arr[i]-average);
        };
        stdev = stdev/(arr.length-1);
        stdev = Math.pow(stdev,0.5);
        return stdev;

    };
    public static void main(String[] args ){
        int[] a= {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        double stdeva=stdev(a);
        System.out.println(stdeva);
    }
}