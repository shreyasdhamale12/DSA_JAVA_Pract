public class search_in_range {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7,8,9,-1};
        int target = 3;

        int result = searchinRange(arr,target,1,7);
        if(result == arr.length){
            System.out.println("Target not found");
        }else {
            System.out.println("Target found" + result);
        }
    }

    static int searchinRange(int[] arr,int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start;index <=end;index++){

            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return arr.length;
    }
}
