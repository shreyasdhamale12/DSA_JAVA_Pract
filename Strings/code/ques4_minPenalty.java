import java.util.Arrays;
import java.util.Scanner;

public class ques4_minPenalty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        int result = minPenalty(nums);
        System.out.println(result);

    }

    static int minPenalty(int[] arr){

        Arrays.sort(arr);

        int penalty=0;
        for (int i=1;i<arr.length;i++){
            penalty = penalty + Math.abs(arr[i] - arr[i-1]);
        }
            return penalty;
    }


}
