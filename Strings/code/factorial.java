import java.util.ArrayList;

public class factorial {
    public static void main(String[] args) {

        int n = 81;
        factors(n);
    }

    static void factors(int n){

        ArrayList<Integer> arl = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n%i == 0){
                if (n%i == i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    arl.add(n/i);
                }
            }
        }

        for (int i=arl.size() - 1;i>=0;i--){
            System.out.print(arl.get(i) + " ");
        }
    }
// 1 3 27 81
}
