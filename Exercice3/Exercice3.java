package Exercice3;
public class Exercice3{
    public static int[][] construct(){
        int[][] arr =new int[5][];
        int k = 1;
        for(int i = 0; i<5; i++){
            arr[i] = new int[i+1];
            for(int j = 0;j<i+1; j++){
                arr[i][j]=k;
                k+=1;

            }

        }
        return arr;
    }
    public static void main(String[] args){
        int[][] arr = construct();
        for(int i = 0; i<5; i++){

            for(int j = 0;j<i+1; j++){
               System.out.print(arr[i][j] + " ");

            };
            System.out.println("\n");

        }

    }
}