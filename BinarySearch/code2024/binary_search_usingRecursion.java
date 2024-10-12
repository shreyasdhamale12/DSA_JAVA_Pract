public class binary_search_usingRecursion {

    static int search(int[] arr,int target, int start,int end){

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if (arr[mid] == target){
            return mid;
        }

        if (target > arr[mid]){
            return search(arr, target, mid + 1, end);
        }

        return search(arr, target, start, mid - 1);


    }

}
