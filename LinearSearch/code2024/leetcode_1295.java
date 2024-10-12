public class leetcode_1295 {
    public static void main(String[] args) {


        int[] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int test = nums[i]%2;
            if(has_even_no(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean has_even_no(int num) {
       int digit_count = 0;

       if(num < 0){
           num= num * -1;
       }
       if(num == 0){
           return false;
       }
       while(num>0){
           num = num/10;
           digit_count++;
       }
       return digit_count%2 == 0;
    }

}
