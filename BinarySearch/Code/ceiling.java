public class ceiling {
    public static void main(String[] args) {

        int[] element = {1,3,5,7,9,11};
        int target = 6;

        System.out.println(Ceiling(element,target));

    }

    static int Ceiling(int[] element,int target){

        int start = 0;
        int end = element.length - 1;

        while (start<=end){

            int mid = start + (end-start)/2;

            if (target<element[mid]){
                end = mid - 1;
            } else if (target>element[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }

        }
        return start;

    }
}
