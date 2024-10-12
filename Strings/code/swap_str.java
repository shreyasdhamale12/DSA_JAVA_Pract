public class swap_str {
    public static void main(String[] args) {
    String str = "apples";
        System.out.println(swap(str,'a','p'));
    }

    static String swap(String str,char ch1,char ch2){

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ch1){
              result += ch2;
            }
            else if(str.charAt(i) == ch2){
                result += ch1;
            }else {
                result += str.charAt(i);
            }

        }
        return result;
    }

}
