import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick_sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick_sort(int[] arr,int low,int high){

        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end -start)/2;
        int pivot = mid;

        while (start <= end){

            while (arr[start] < arr[pivot]){
                start++;
            }
            while (arr[end] > arr[pivot]){
                end--;
            }

            if (start<= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quick_sort(arr, low, end);
        quick_sort(arr, start, high);
    }

}
