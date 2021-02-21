package Optional;

import java.io.*;
import java.util.*;
public class SecondJava {
    public static void main(String args[]){
        if(args.length<1){ //validez argumentul
            //System.err.println(-1);
            System.out.println("Nu s-a specificat niciun argument la linia de comanda");
        }
        int n =Integer.parseInt(args[0]); //transform argumentul in nr intreg
        int matrix[][] = new int[n][n];
        System.out.println(n);
        /*creez un graf random prin generarea unei matrici de adiacenta random pentru nr. de varfuri precizat la linia de comanda (adica n)*/
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix[i][j]=(int) (Math.random() * 10)%2;
            }
        }
        /*afisarea matricii*/
        for (int[] row : matrix){
            // converteste fiecare rand la string si afiseaza fiecare rand separat
                System.out.println(Arrays.toString(row));
            }
    }
}