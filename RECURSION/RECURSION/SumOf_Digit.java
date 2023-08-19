/*Q1 : Given an integer, find out the sum of its digits using recursion.
Input: n= 1234
Output: 10
Explanation: 1+2+3+4=10*/

import java.util.*;
public class SumOf_Digit{

    public static int FindSum(int n){
        int result=0;
        if(n==0){
            return 0;
        }else{
            result= (n%10)+FindSum(n/10);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num=sc.nextInt();
        System.out.println("Sum of Digit is: "+FindSum(num));
    }
}