public class leetcode_645 {
    class Solution {
        public int[] findErrorNums(int[] arr) {

            int i=0;
            while(i < arr.length){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }
                else{
                    i++;
                }
            }

            for(int index=0;index < arr.length;index++){
                if(arr[index] != index + 1){
                    return new int[]{arr[index], index+1};
                }
            }
            return new int[]{-1,-1};
        }

        static void swap(int[] arr,int start,int second){
            int temp = arr[start];
            arr[start] = arr[second];
            arr[second] = temp;
        }
    }

}
