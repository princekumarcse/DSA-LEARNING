/*Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
of every digit in that number raised to the power of total digits in that number is equal to the number.
Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
Input1 : 153
Output1 : Yes
Input 2 : 134
Output2 : No
*/
import java.util.*;
public class Armstrong{
     public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static int isArmstrong(int num) {
        int originalNum = num;
        int totalDigits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, totalDigits);
            num /= 10;
        }

        if(sum == originalNum){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        int num=153;
        int result=isArmstrong(num);
        if(result==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}