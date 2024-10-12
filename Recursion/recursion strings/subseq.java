import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {

//        string_seq("","abc");
        ArrayList<String> result = new ArrayList<>();

        string_seqInArrayList("","abc",result);
        System.out.println(result);

    }

    static void string_seq(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        string_seq(p+ch,up.substring(1));
        string_seq(p,up.substring(1));

    }

    static void string_seqInArrayList(String p, String up, ArrayList<String> result){

        if (up.isEmpty()){
            result.add(p);
            return;
        }

        char ch = up.charAt(0);
        string_seqInArrayList(p+ch,up.substring(1),result);
        string_seqInArrayList(p,up.substring(1),result);

    }

}
