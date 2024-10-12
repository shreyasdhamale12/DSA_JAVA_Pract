public class search_string {
    public static void main(String[] args) {
        String str = "Shreyas";
        char ch = 'r';

        System.out.println(search_string(str,ch));

    }

    static boolean search_string(String name,char target){

        if (name.length() == 0){
            return false;
        }

        for (int i =0 ; i<name.length();i++){
            if (target == name.charAt(i)){
                return true;
            }
        }


        return false;
    }
}
