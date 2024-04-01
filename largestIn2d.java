package TwoD;
import java.util.*;

public class largestIn2d {
        public static void main(String[] args) {
            
        
    int m,n,max=0;
    Scanner in=new Scanner(System.in);

    m=in.nextInt();
    n=in.nextInt();

    int arr[][]=new int[m][n];

        System.out.println("Enter the element ");

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
              arr[i][j]=in.nextInt();
            }
        }

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){ 
                if(arr[i][j] > max)
                max=arr[i][j];
            }
        }
        System.out.println(max);
        }
}
