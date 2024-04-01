
package TwoD;
 

import java.util.Scanner;

public class TwoDInput {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);

        int posi=0;
        int negi=0;
        int odd=0;
        int evem=0;
        int zero=0;
        
        System.out.println("Enter the raw :");
        int m=in.nextInt();
        System.out.println("Enter the colunm :");
        int n=in.nextInt();

        int arr[][]=new int[m][n];

        System.out.println("Enter the element ");

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
              arr[i][j]=in.nextInt();
            }
        }

        for ( int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                System.out.print( arr[i][j]  +  "  ");
            }
            System.out.println();
        }

        for (int i =0;i<m;i++){
            for(int j=0;j<n;j++){
      
                if(arr[i][j] > 0)posi++;
                if(arr[i][j] < 0)negi++;

                if(arr[i][j] == 0)zero++;
                if((arr[i][j] % 2) == 0)evem++;
                if((arr[i][j] % 2) != 0)odd++;
            }}
            System.out.println("Number of positives = " + posi);
            System.out.println("Number of negatives = " + negi);
            System.out.println("Number of odds = " + odd);
            System.out.println("Number of evens = " + evem);
            System.out.println("Number of zeroes = " + zero);
        
        
            }
        
        
    }

