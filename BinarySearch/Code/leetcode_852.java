public class leetcode_852 {
    public static int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            int mid = left + (right - left)/2;

            if (arr[mid]<arr[mid+1]){
                left = mid +1;
            }else {
                right = left;
            }

        }
        return left;
    }

    public static void main(String[] args) {
//        Mountain solution = new Mountain();

        int[] arr = {0,1,2,3,4,5,4,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
