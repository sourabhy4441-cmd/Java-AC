import java.util.*;
public class PairsInArray{
    public static void Pairs(int nums[]){
        int tp=0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("(" + curr + "," + nums[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total Pairs : " + tp);
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Array");
        int n = sc.nextInt();

        int[] nums = new int[n];


        System.out.println("Enter elements");
        for(int i=0; i<n ; i++){
            nums[i] = sc.nextInt();
        }


        Pairs(nums);
        
        sc.close();
    }
    
}