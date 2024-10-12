public class productOfDigits {
    public static void main(String[] args) {
        int n = 123;
//        System.out.println(usingRecursion(n));
        System.out.println(usingBruteforce(n));
    }

    static int usingBruteforce(int n){

        int product =1;
        while(n>0){
            product *= n %10;
            n = n/10;
        }
        return product;
    }

    static int usingRecursion(int n){

        if (n%10 == n){
            return n;
        }

        return n %10 * usingRecursion(n/10);

    }

}
