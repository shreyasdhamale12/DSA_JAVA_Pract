import java.util.Arrays;

public class sliding_winndow {
    public static void main(String[] args) {

        int[] arr = {25, 21, 25, 11, 12, 11};
        int k = 2;
        System.out.println(Arrays.toString(slidingWindow(arr,k)));
    }

    static int[] slidingWindow(int[] arr,int k){

        int n = arr.length;

        if(n<k){
//            throw new IllegalArgumentException("Array ");
            return new int[-1];
        }
        
        int miniSum = 0;
        int miniIndex = 0;
        
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum = currentSum + arr[i];
        }
        miniSum = currentSum;

        for (int i = 1; i < n-k; i++) {
            currentSum = 0;
            for (int j = i; j < i+1; j++) {
                currentSum = currentSum + arr[j];
            }

            if (currentSum < miniSum) {
                miniSum = currentSum;
                miniIndex = i;
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[miniIndex + i];
        }
        return result;
    }

}
