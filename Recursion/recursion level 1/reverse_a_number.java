public class reverse_a_number {

    static int reversed = 0;

    static void reverse(int num){

        if (num == 0){
            return;
        }

        int digit = num%10;
        reversed = reversed * 10 + digit;
        reverse(num/10);

    }


    static int usingBruteforce(int num){
        int reversedNum = 0;
        if (num == 0){
            return 0;
        }

        while (num != 0){
            int digit = num%10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {

//        reverse(12345);
//        System.out.println(reversed);
//        int r = usingBruteforce(12345);
        System.out.println(usingBruteforce(12345));
    }
}
