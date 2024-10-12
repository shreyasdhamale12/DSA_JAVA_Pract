
//  Find Position of an element in sorted array

public class findelement_infinte_sortedarray {
    public static void main(String[] args) {

        int[] arr = {11,12,13,14,15,16,17,18,19};
        int target = 14;

        int position = ans(arr,target);
        if (position != -1){
            System.out.println("Element found at: "+ position);
        }else {
            System.out.println("Element not found");
        }

    }

    static int ans(int[] arr,int target){

        int start = 0;
        int end = 1;

        while (target>arr[end]){
//            int newStart = end + 1;

            // newend = end + (sizeofthebox)*2
            //e.g {1,2,3,4,5,6,7} find the size from 4 to 5 so length from 0 to 5 - (start(4) - 1)
//            int newEnd = end + (end - start + 1)*2;
//            start = end;
//            end = newEnd;

            //We can also write
             start= end;
             end = end * 2;
        }

        while (start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
