import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Enter the element you want to search");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int result = bsearch(arr,target);
        System.out.println(result);

    }

    static int bsearch(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
