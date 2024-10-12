public class string_search {
    public static void main(String[] args) {

        String str = "word";
        char ch = 'r';
//        int result = search(str,ch);
        System.out.println(search(str,ch));
    }


    static boolean search(String str, char target){

        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i <str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
