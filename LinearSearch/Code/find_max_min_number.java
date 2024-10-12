public class find_max_min_number {
    public static void main(String[] args) {

        int[] nums = {11,22,33,44,55,66,77};
//        System.out.println(max_min(arr1));

        int min=min(nums);
        int max=max(nums);

        System.out.println("Min"+ min);
        System.out.println("Max"+ max);

    }



    static int min(int[] arr1) {

        int min= arr1[0];
        for (int i=0;i<arr1.length;i++) {
            if (arr1[i]<min){
                min=arr1[i];
            }
        }
        return min;
    }

    static int max(int[] arr1) {

        int max= arr1[0];
        for (int i=0;i<arr1.length;i++) {
            if (arr1[i] > max) {
                max = arr1[i];

            }
        }
        return max;
    }

}
