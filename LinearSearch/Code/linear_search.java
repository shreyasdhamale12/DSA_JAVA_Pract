import java.util.Scanner;

 class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String[] size= sc.nextLine().split("\\s+");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the array(after each element provide space):");
        for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int ans = linearSearch(nums, target);
        System.out.println("Index of target in the array: " + ans);
    }

    // Search in the array: return the index if found
    // If not found, return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Enter the elements");;
        }

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] == target) {
                return index; // Return the index when the target is found
            }
        }
        return -1; // Return -1 if target is not found in the array
    }
}
