 import java.util.*;

public class leetcode_442 {
    public static void main(String[] args) {


        class Solution {
            public List<Integer> findDuplicates(int[] arr) {
                int i =0;
                while(i < arr.length){
                    int correctIndex = arr[i] - 1;
                    if(arr[i] != arr[correctIndex]){
                        swap(arr,i,correctIndex);
                    }else{
                        i++;
                    }
                }
                List<Integer> ans = new ArrayList<>();
                for(int j=0;j<arr.length;j++){
                    if(arr[j] != j+1){
                        ans.add(arr[j]);
                    }
                }
                return ans;
            }



            static void swap(int[] arr,int first,int second){
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
            }

        }

    }
}
