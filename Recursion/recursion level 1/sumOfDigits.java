public class sumOfDigits {
    public static void main(String[] args) {

        int num = 12345;
//        System.out.println(usingBruteforce(num));
        System.out.println(usingRecursion(num));
    }


    static int usingBruteforce(int n){

        int sum = 0;

        while (n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

    static int usingRecursion(int n){

        if (n == 0){
            return 0;
        }
        return usingRecursion(n/10) + n%10;

    }

}
