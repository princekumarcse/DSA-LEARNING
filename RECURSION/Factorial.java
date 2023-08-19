//time complexity =O(n)
//Space complexity= O(n)
import java.util.*;
public class Factorial{
     public static int FindFactorial(int n){
            int result=0;
            if(n==0|| n==1){
                return 1;
            }else {
                result=n*FindFactorial(n-1);
            }
            return result;
        }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=sc.nextInt();
        System.out.println("The Factorial is: "+FindFactorial(num));
    }
}