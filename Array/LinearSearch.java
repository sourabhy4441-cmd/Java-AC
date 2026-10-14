import java.util.*;

public class LinearSearch{
    // public static int LinearSearch(int[] numbers, int key ){

    //     for(int i=0; i< numbers.length; i++){
    //         if(numbers[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args){
    //     int numbers[] = {2,4,6,8,10,12,14,16};
    //     int key=10;

    //     int index = LinearSearch(numbers, key);
    //     if(index == -1){
    //         System.out.println("Key is not found ");
    //     }
    //     else{
    //         System.out.println("key is found at index : " + index);
    //     }
    
    // }



    // user input

    public static int LinearSearch(int[] numbers, int key ){

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == key){
                return i;
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

        int index = LinearSearch(numbers, key);
        if(index == -1){
            System.out.println("Key is not found ");
        }
        else{
            System.out.println("key is found at index : " + index);
        }
    
    }
}