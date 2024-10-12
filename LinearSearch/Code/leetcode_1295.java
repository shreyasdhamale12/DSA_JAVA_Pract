    public class leetcode_1295 {
            public static void main(String[] args) {

                int[] nums= {12,345,2,6,7896};

                int counteven = countnumbers(nums);
                System.out.println(counteven);

                int countodd = countnumbersodd(nums);
                System.out.println("Odd "+countodd);

            }

        static int countnumbers(int[] nums){

            int count = 0;
            for (int num:nums){
                if (countdigits(num)%2 == 0){
                    count++;
                }
            }
            return count;

        }

        static int countnumbersodd(int[] nums){

            int count = 0;
            for (int num:nums){
                if (countdigits(num)%2 == 1){
                    count++;
                }
            }
            return count;

        }

        static int countdigits(int  num){

            int digitcount = 0;
            while (num != 0 && num != 0){
                num /= 10;
                digitcount++;
            }
            return digitcount;
        }
    }
