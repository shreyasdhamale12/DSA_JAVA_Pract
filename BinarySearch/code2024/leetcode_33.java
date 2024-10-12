public class leetcode_33 {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        int result = findPivot(arr);
        System.out.println(result);

    }

    public int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1){
            return binarySearch(arr,target,0,arr.length - 1);
        }
        if (target == arr[pivot]){
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr,target,0,pivot -1);
        }
        return binarySearch(arr,target,pivot +1, arr.length - 1);
    }

    static int binarySearch(int[] arr,int target,int start,int end){

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(mid > start && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] >= arr[start]){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    static int findPivotForDuplicates(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(mid > start && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] == arr[start] && arr[mid] ==arr[end]){

                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
//
//                explain for the second half
//
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}
