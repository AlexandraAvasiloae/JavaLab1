package Optional;

import java.io.*;
import java.util.*;
public class SecondJava {

    public static void main(String args[]){

        /*argument validation*/
        if(args.length<1){
            System.err.println(-1);
            System.out.println("Specify the argument!");
        }

        /*convert the argument to int*/
        int n =Integer.parseInt(args[0]);

        /*generate the random graph by filling the adjacency matrix with random values of 0 or 1*/
        int matrix[][] = new int[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix[i][j]=(int) (Math.random() * 10)%2;
            }
        }
        /*Display on the screen the generated matrix*/
        for (int[] row : matrix){
                System.out.println(Arrays.toString(row));
            }
    }
}