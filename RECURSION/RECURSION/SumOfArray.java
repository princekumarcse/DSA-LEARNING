/*Find the sum of the values of the array [92, 23, 15, -20, 10].*/
public class SumOfArray{


    public static int FindSum(int[] arr, int index){
        int result=0;
        if(index==arr.length){
            return 0;
        }else{
            int currElement =arr[index];
            int sumResult=FindSum(arr,index+1);
            result = currElement+sumResult; 
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr={92,23,15,-20,10};
        int result= FindSum(arr,0);
        System.out.println("The Sum is: "+result);
    }
}