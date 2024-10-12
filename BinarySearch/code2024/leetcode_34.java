public class leetcode_34 {
    public static void main(String[] args) {

    }

    public int[] searchinRange(int[] nums,int target){

        int[] ans = {-1,-1};

        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    //this function only returns the index
    int search(int[] arr,int target, boolean firstIndexOf){
        int ans = -1;

        int start = 0;
        int end = arr.length -1;

        while (start <= end){

            int mid = start + (end - start)/2;
//            int mid = (start + end)/2;
            if (target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if (firstIndexOf == true){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
