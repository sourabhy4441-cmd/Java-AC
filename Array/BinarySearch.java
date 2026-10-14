import java.util.*;
public class BinarySearch{    
    
    public static int BinarySearch(int[] numbers, int key ){

        int left = 0;
        int right = numbers.length-1;
        

        while(left <= right){
            int mid = (left + right)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key ){ 
                right = mid-1;
            }
            else{
                left = mid+1;            
            }
            
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of array");
        int n=sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter key to search");
        int key = sc.nextInt();

        int index = BinarySearch(numbers, key);
        if(index == -1){
            System.out.println("Key is not found ");
        }
        else{
            System.out.println("key is found at index : " + index);
        }
    
    }
}