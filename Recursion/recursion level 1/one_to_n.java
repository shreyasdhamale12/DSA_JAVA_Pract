public class one_to_n {
    public static void main(String[] args) {
//        one_TO_n(5);
//          n_TO_one(5);
        magic(5);
    }


    static void one_TO_n(int n){
        if (n == 0){
            return;
        }

        System.out.println(n);
        one_TO_n(n-1);
    }

    static void n_TO_one(int n){
        if (n == 0){
            return;
        }

        n_TO_one(n-1);
        System.out.println(n);
    }

    static void magic(int n){

        if (n == 0){
            return;
        }
        System.out.println(n);
        magic(n-1);
        System.out.println(n);
    }

}
