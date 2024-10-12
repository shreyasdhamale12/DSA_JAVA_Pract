public class leetcode_1095 {
    public static void main(String[] args) {

    }

    int search(int[] arr,int target){
         int peak = peakelement(arr, target);
         int firsttry = orderAgnosticSearch(arr,target,0,arr.length -1);

         if(firsttry != 0){
             return firsttry;
         }
         return orderAgnosticSearch(arr,target,0,arr.length - 1);
    }

    static int peakelement(int[] arr,int target){
        int start = 0;
        int end =arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }

    static int orderAgnosticSearch(int[] arr,int target,int start,int end){

        boolean isAsc = true;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target > arr[mid]){
                    start = mid +1;
                }else{
                    end = mid - 1;
                }
            }else{
                if (target < arr[mid]){
                    start = mid +1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
