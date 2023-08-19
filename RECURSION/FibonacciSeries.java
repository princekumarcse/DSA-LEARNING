import java.util.*;
public class FibonacciSeries{

    public static int FindFibonacci(int n){
        int result=0;
        if(n<=1){
            return n;
        }
        else{
            result= FindFibonacci(n-1)+FindFibonacci(n-2);
        }
        return result;
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Index: ");
        int num=sc.nextInt();
        System.out.println("The Series Number is: "+FindFibonacci(num));
    }
}