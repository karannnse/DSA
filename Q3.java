package TwoD;

public class Q3 {

    public static void main(String[] args) {
        
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};


        int n=arr.length;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j ){
                    System.out.print(arr[i][j] + " ");
                }else if(i+j==n-1){
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
    
}
