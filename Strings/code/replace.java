public class replace {
    public static void main(String[] args) {
        String str = "alpha";
        System.out.println(swap(str));
    }

    static String swap(String str){

        StringBuilder result = new StringBuilder();

        for (char c: str.toCharArray()){
            if (c == 'a'){
                result.append('b');
            } else if (c == 'b') {
                result.append('a');
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }


}
