package DSA_pract;

public class max_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,2,6));

    }


    static int max(int arr[]){
        int maxval = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    static int maxRange(int arr[], int start, int end){
        int maxval = arr[start];

        for (int i = start; i < end; i++) {
            if (arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
