import java.util.*;
public class MaxFrequency {
    
    public static int mostFrequent(ArrayList<Integer> arr, int key) {
        int[] freqArr = new int[1001];

        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == key && i+1 < arr.size()){
                freqArr[arr.get(i+1)]++;
            }
    
        }
        int maxValue=0;
        int target=0;

        for(int i=0;i<freqArr.length;i++){
            if(freqArr[i] > maxValue){
                maxValue = freqArr[i];
                target = i;
            }
        }
        return target;
    }

}
