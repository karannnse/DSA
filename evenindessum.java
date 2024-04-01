package assignmentArrays;

public class evenindessum{
    public static void main(String[] args) {

        //Question 1
       /*  int []arr={3,20,4,6,9};
        int sum=0;
        int n=arr.length;

    
        for(int i=0;i<n;i=i+2){
                sum= sum + arr[i];
        }
        System.out.println("the sum of the even indices :" + sum);*/

       /*  Q2: Write a program to traverse over the elements of the array using for each loop and print all even
elements.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 34 54

        int arr[]={34,21,54,65,43};
        int n =arr.length;

        for (int element : arr) {
            if(element %2==0)
            System.out.println("even elemnt :"+ element);
            
        }*/
       
      /*   Q3: Write a program to calculate the maximum element in the array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 65


int arr[]={34,21,54,65,43};
int n= arr.length;

int max=0;

for(int i = 0; i < n;i++){
    if(max < arr[i])
    {
      max = arr[i];
    }
}
System.out.println("maximum is the : " + max);*/

/*Q4: Write a program to find out the second largest element in a given array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 54*/


    /*int arr[]={34,21,54,65,43};
int n = arr.length;
int max=0;
int second_large=0;
for(int i = 0; i < n;i++){
    if(max<arr[i]){
        max= arr[i];
    }
}

for(int j=0; j<n ;j++){
    if( arr[j]< max );
{
    second_large = arr[j];
    
}

}
System.out.println(second_large);*/

/*Given an array. Find the first peak element in the array. A peak element is an element that is greater than
its just left and just right neighbor.
Input 1: arr[] = {1,3,2,6,5}
Output 1: 6*/
int arr[]={1,3,2,6,5};
int n= arr.length;

int peak=0;

for(int i = 0; i < n;i++){
    if(peak < arr[i])
    {
      peak = arr[i];
    }
}
System.out.println("peak element : " + peak);
    }
    
    
}
