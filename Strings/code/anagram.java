import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(checkAnagram(s1,s2));


    }

    static String checkAnagram(String s1,String s2){

        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();

        if (s1.length() != s2.length()){
            return "no";
        }

        char[] strArray1 = s1.toCharArray();
        char[] strArray2 = s2.toCharArray();
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        if (Arrays.equals(strArray1,strArray2)){
            return "yes";
        }else {
            return "no";
        }

    }

}
