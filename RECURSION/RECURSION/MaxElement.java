/*Q3: Print the max value of the array [ 13, 1, -3, 22, 5].*/
import java.util.*;
public class MaxElement{

    public static int FindMax(int[] arr, int index){
      
       if (index == arr.length - 1) {
            return arr[index];
        }else{
        int result = FindMax(arr, index + 1);
        return Math.max(arr[index], result);
        }
        
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[]={13, 1, -3, 22, 5};
        System.out.println("The Maximum Element is: "+ FindMax(arr,0));
    }
}