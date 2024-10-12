public class leetcode_1672 {
    public static void main(String[] args) {

        int[][] accounts = {
                {1,3,5},
                {2,4,6}
        };
        System.out.println(maxwealth(accounts));

    }

    static int tocalculate(int[] accounts){
        int wealth = 0;
        for (int i = 0;i<accounts.length;i++){
            wealth += accounts[i];
        }
        return wealth;
    }

    static int maxwealth(int[][] accounts){

        int maxwealth = 0;
        for (int i =0;i<accounts.length;i++){
            int wealth = tocalculate(accounts[i]);
            maxwealth = Math.max(maxwealth,wealth);
        }
        return maxwealth;
    }


}
