import java.util.*;
public class SumOfDigit{

    public static int FindSumOfDigit(int n){
        int result=0;
        if(n==0){
            return n;
        }else{
            result=(n%10)+FindSumOfDigit(n/10);
        }
        return result;
    }
    public static void main(String rags[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("Sum of Digit is: "+FindSumOfDigit(num));
    }

}