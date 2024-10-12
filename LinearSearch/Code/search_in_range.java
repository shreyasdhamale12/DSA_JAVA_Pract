public class search_in_range {
    public static void main(String[] args) {

        int[] arr = {45, 44 , 66 ,88, 77,55,89 };
        int target = 66;

        System.out.println(searchinrange(arr,target,1,4)    );


    }

    static int searchinrange(int[] array,int range,int start, int end){

        if (array.length == 0){
            return -1;
        }

        for (int i=start;i<=end;i++){
            int element = array[i];
            if (element == range){
                return i;
            }
        }
        return -1;
    }
}
