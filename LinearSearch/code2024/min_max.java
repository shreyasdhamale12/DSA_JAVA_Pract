public class min_max {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,9,3,4};
        System.out.println("Min element: " + min(arr));
        System.out.println("Min element: " + max(arr));
    }
     static int max(int[] arr){

         int element = arr[0];
         for (int index = 1; index < arr.length; index++) {

             if(arr[index]>element){
                 element = arr[index];
             }
         }
         return element;
     }
    static int min(int[] arr){

        int element = arr[0];
        for (int index = 1; index < arr.length; index++) {

            if(arr[index]<element){
                element = arr[index];
            }
        }
        return element;
    }
}
