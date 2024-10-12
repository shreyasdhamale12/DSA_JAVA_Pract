import java.util.Arrays;

public class search_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        int[] result = search(arr,target);
        int[] result1 = find_minAndmax(arr);
//        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
    }

    static int[] search(int[][] arr,int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return null;
    }

    static int[] find_minAndmax(int[][] arr){

        int min = arr[0][0];
        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < min){
                    min = arr[row][col];
                }

                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return new int[]{min,max};
    }
}
