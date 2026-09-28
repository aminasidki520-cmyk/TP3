package Exercice5;
public class Exercice5{
    public static int[][] matrixAdd(int[][] m,int[][] n){
        int[][] sumMatrix= new int[m.length][m[0].length];
        for(int i = 0 ; i<m.length; i++){
            for(int j = 0 ; j<m[0].length ; j++){
                sumMatrix[i][j] = m[i][j] + n[i][j];
            }
        };
        return sumMatrix;

    };
    public static void main(String[] args){

    }
}