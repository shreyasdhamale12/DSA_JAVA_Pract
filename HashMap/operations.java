import java.util.HashMap;
import java.util.Map;

public class operations {
    public static void main(String[] args) {

        HashMap<Integer,String> h1 = new HashMap<>();

        h1.put(1,"Rohan");
        h1.put(2,"Mohan");
        h1.put(3,"Sham");
        h1.put(4,"Pintu");
        System.out.println(h1);

        h1.put(2,"ChangedName");
        System.out.println(h1);

        h1.remove(3);
        System.out.println(h1);

//        for (String value : h1.values()) {
//            System.out.print("Value: " + value);
//        }

        for(Map.Entry<Integer,String> e : h1.entrySet()){
            System.out.print(e.getKey() + " " + e.getValue() + ",");
        }


    }

}
