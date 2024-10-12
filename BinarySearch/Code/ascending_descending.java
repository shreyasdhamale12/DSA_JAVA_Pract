import java.util.Arrays;

public class ascending_descending {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {6,5,4,3,2,1};
        int[] arr3= {45,6,2,1,45,4};

        System.out.println(Arrays.toString(arr1) + usingbinarysearch(arr1));
        System.out.println(Arrays.toString(arr2) + usingbinarysearch(arr2));
        System.out.println(Arrays.toString(arr3) + usingbinarysearch(arr3));
    }


    static String usingbinarysearch(int[] arr){
        if (arr.length <= 1){
            return "Invalid Input";
        }

        if (arr[0] < arr[arr.length - 1]){
            return "Ascending";
        } else if (arr[0] > arr[arr.length - 1]) {
            return "Descending";
        }else {
            return "Neither Ascending nor Decending";
        }

    }

}
//    static String tofind_asen_dec(int[] arr){
//
//        boolean ascending = true;
//        boolean decending = true;
//
//        for (int i=1;i<arr.length;i++){
//            if (arr[i]<arr[i-1]){
//                ascending = false;
//                break;
//            }
//        }
//
//        for (int i=1;i <arr.length;i++){
//            if (arr[i]>arr[i-1]){
//                decending = false;
//                break;
//            }
//        }
//        if (ascending){
//            return "ascending";
//        } else if (decending) {
//            return "decending";
//        }else {
//            return "Niether asscend or decend";
//        }
//    }