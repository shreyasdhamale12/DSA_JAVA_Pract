public class linearsearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,99,2,44,66};
        int target = 5;
        int result = linear_search(arr,target);
        System.out.println(result);

    }

    static int linear_search(int[] arr,int target){

        if(arr.length == 0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){

           int element = arr[index];
           if(element == target){
               return index;
           }
        }
        return -1;
    }
}
