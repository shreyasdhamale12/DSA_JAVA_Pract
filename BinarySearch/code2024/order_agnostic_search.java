import java.util.Scanner;

public class order_agnostic_search {
    public static void main(String[] args) {

        int[] arr = {99, 88, 77, 66, 55, 44, 33, 22, 11};

        System.out.println("Enter the element you want to search:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int result = bsearch(arr, target);
        if (result == -1) {
            System.out.println("Element does not exist");
        } else {
            System.out.println("Element found at index: " + result);
        }
        sc.close();
    }

    static int bsearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; // Check if array is ascending

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) { // Ascending order
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // Descending order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }
}
