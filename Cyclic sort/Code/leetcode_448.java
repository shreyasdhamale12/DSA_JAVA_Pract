import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class leetcode_448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println(result);
        System.out.println(Arrays.toString(arr));

    }

        static List<Integer> findDisappearedNumbers(int[] arr) {
            cyclic(arr);
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    result.add(i + 1);
                }
            }
            return result;
        }

        static void cyclic(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correctIndex = arr[i] - 1; // Correct index for the value arr[i]
                if (arr[i]>0 && arr[i] <= arr.length &&arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    i++;
                }
            }
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

