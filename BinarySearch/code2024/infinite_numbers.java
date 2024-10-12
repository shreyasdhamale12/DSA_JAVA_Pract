
//find the target element in the array infinite  numbers
// Question : Find position of an element in a sorted array of infinite numbers

public class infinite_numbers {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};

        int target = 10;
        System.out.println(searchinRange(arr,target));
    }

    static int searchinRange(int[] arr,int target){

        int start = 0;
        int end = 1;

        while (target >= arr[end]){
            int tempStart = end + 1;

            //double the box value
            //end = previous end + boxsize * 2     // boxsize = end - (start -1)i.e previous box size
            end = end + (end - start +1) * 2;
            start = tempStart;

        }
        return bsearch(arr,target,start,end);
    }

    static int bsearch(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
