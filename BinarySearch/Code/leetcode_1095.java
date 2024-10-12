public class leetcode_1095 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,2,1};
        System.out.println(search(arr,4));

    }

    static int search(int[] arr,int target){

        int peak = findpeakelement(arr);
        int firsttry = checkif_asc_or_dec(arr,target,0,peak);

        if (firsttry !=0){
            return firsttry;
        }

        //try to search in second half
        return checkif_asc_or_dec(arr,target,0,arr.length-1);

    }

    static int findpeakelement(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start<end){
            int mid = start + (end-start)/2;

            if (arr[mid]>arr[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }

    static int checkif_asc_or_dec(int arr[],int target,int start,int end){

        boolean isAscen = arr[start]<arr[end];

        while (start<end){
            int mid = start + (end - start)/2;

            if (target == mid){
                return mid;
            }

            if (isAscen){
                if (target>arr[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                ////////////// Explain the decending part
                if (target < arr[mid]) { // If the target is less than the element at the middle index
                    start = mid + 1; // Adjust the search range to the right half
                } else {
                    end = mid - 1; // Adjust the search range to the left half
                }
            }
        }
        return -1;
    }
}
