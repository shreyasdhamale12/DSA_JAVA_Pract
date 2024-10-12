public class binary_search {
    public static void main(String[] args) {
        int[] arr = {-4, -2,0,2,5,9,11,15,18,22,25,30};
        int target = 22;
        System.out.println(binarysearch(arr,target));

    }

    //find element in array
    static int binarysearch(int[] arr,int tar){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){

            int mid = start + (end - start)/2;

            if (tar < arr[mid]){
                end = end - 1;
            } else if (tar>arr[mid]) {
                start = start + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
