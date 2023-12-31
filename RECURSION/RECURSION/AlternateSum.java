/*
Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
Constraints : 0<=n<=1e6
Input1 : n = 10
Output 1 : -5
Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
Input 2 : n = 5
Output 2 : 3
*/

//time complexity O(n)
//space complexity O(n)
import java.util.*;
public class AlternateSum{

    public static int FindSum(int n){
        //base case
        if(n==0){
            return 0;
        }else if(n%2==0){
                return FindSum(n-1)-n;    
        }else{
            return FindSum(n-1)+n;
        }
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("The Alternate Sum is: "+FindSum(num));
    }
}