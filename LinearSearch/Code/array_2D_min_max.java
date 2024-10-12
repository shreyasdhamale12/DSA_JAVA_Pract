public class array_2D_min_max {
    public static void main(String[] args) {
        int [][] arr1 = {
                {11,12,13},
                {21,22,23},
                {31,32,33}
        };

        int min = min(arr1);
        int max = max(arr1);

        System.out.println(min);
        System.out.println(max);

    }

    static int min(int[][] array){

        int min=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    static int max(int[][] array){

        int max=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
