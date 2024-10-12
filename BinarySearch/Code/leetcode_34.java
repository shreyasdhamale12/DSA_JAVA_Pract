public class leetcode_34 {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,4,4,4,4,5,6};
        int target = 4;
//        System.out.println(searchRange_left(nums,target));
        int[] result = searchinrange(nums,target);
        System.out.println(result[0] +"  "+result[1]);
    }

    public static int[] searchinrange(int[] nums, int target){

        int[] ans = {-1,-1};

        int start = searchRange_right(nums,target,true);
        int end = searchRange_right(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }



    public static int searchRange_right(int[] nums, int target, boolean findstartindex) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if (nums[mid] == target){
                ans = mid;
                if (findstartindex == true){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            } else if (target<=nums[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
