public class skip_letter {
    public static void main(String[] args) {

//        skip("","baccaad");
        System.out.println(skipAppandNotApple("baaccapplead"));
    }


    static void skip(String p,String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p,up.substring(1));
        }else {
            skip(p + ch,up.substring(1));
        }
    }

    static String skip1(String up){

        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            return skip1(up.substring(1));
        }else {
            return ch + skip1(up.substring(1));
        }
    }
    static String skipAppandNotApple(String up){

        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppandNotApple(up.substring(3));
        }else {
            return ch + skipAppandNotApple(up.substring(1));
        }
    }


}
