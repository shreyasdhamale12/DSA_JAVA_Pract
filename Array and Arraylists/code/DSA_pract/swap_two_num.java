package DSA_pract;

import java.util.Arrays;

public class swap_two_num {
    public static void main(String[] args) {
        int[] arr = {8,56,29,268,12,11,5};
//        swap(arr,1,3);
//        System.out.println(Arrays.toString(arr));

//        reverse(arr);
//        System.out.println(Arrays.toString(arr));

        reverseAnother(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void reverseAnother(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}
