import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection_sort(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr,int row,int col,int max){

        if (row == 0){
            return;
        }

        if (col < row){
            if (arr[col] > arr[max]){
                selection_sort(arr, row, col+1,col);
            }else {
                selection_sort(arr, row, col+1,max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row -1] = temp;
            selection_sort(arr,row-1,0,0);
        }

    }

}
