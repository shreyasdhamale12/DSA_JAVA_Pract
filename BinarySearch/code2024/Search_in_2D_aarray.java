import java.util.Arrays;

public class Search_in_2D_aarray {
    public static void main(String[] args) {
        int[][] array = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int target = 37;
//        int[] result = Arrays.toString(search(array,target));
        System.out.println(Arrays.toString(search(array,target)));
    }
    
        static int[] search(int[][] arr, int target){

    //        boolean found = false;
//            for (int i=0;i< arr.length;i++){
//                for (int j = 0; j < arr[i].length; j++) {
//                    if(arr[i][j] == target){
//                        return new int[]{i,j};
//                    }
//                }
//            }
            int row=0;
            int col = arr.length - 1;

            while(row < arr.length && col >=0){
                if(arr[row][col] == target){
                        return new int[]{row,col};
                    }
                if(arr[row][col]<target){
                    row++;
                }
                if(arr[row][col]>target){
                    col--;
                }
            }

            return new int[]{-1,-1};
        }
}
