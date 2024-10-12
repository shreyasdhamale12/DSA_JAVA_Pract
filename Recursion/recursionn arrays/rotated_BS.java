public class rotated_BS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rotated_binarySearch(arr,7,0, arr.length - 1));
    }

    static int rotated_binarySearch(int[] arr,int target,int start,int end){
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return rotated_binarySearch(arr, target, start, mid-1);
            }else{
                return rotated_binarySearch(arr, target, mid+1, end);
            }
        }

        if (target >= arr[mid ] && target <= arr[end]){
            return rotated_binarySearch(arr, target, mid+1, end);
        }
        return rotated_binarySearch(arr, target, start, mid-1);
    }

}
