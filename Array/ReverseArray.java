import java.util.*;
public class ReverseArray{
    public static int[] ReverseArray(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
       return nums; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of array");
        int n= sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
           nums[i] = sc.nextInt();
        }
        
        ReverseArray(nums);
        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i] + " ");
        }
        sc.close();
    }
}