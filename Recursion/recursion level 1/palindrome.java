public class palindrome {
    public static void main(String[] args) {

        System.out.println(usingTwoPointer(12321));

    }

    static boolean usingTwoPointer(int num){

        if (num == 0){
            return false;
        }

        String str = Integer.toString(num);

            int start = 0;
            int end = str.length() - 1;

            while (start < end){
                if (str.charAt(start) != str.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        return true;
    }

}
