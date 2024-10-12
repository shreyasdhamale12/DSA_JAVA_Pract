public class countZeros {
    public static void main(String[] args) {

        int num = 0;
        System.out.println(zeros(num));
    }

    static int zeros(int num){

        int count = 0;
        int original = 0;

        if (num == 0){
            return 1;
        }

        while (num>0){
            int digit = num % 10;
            if (digit == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }

}
