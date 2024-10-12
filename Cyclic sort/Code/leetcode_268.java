import java.util.Arrays;

public class leetcode_268 {
    public static void main(String[] args) {

        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissingNo(arr));


    }

    static int findMissingNo(int[] arr){
        cyclic(arr);
    for(int i=0;i< arr.length;i++){
//        int check = i - 1;
        if (arr[i] != i){
            return i;
        }
    }
    return arr.length;
    }

    static void cyclic(int[] arr){
        int i=0;
        while (i < arr.length){
            if( arr[i]< arr.length && arr[i] != arr[arr[i]]){
                swap(arr,i,arr[i]);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}
