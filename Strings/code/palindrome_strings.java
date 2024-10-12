 class PalindromeCheck {
    static boolean plaindrome(String str){
        return palindromeRecursive(str,0,str.length()-1);
    }

     private static boolean palindromeRecursive(String str, int left, int right) {

        if (left >= right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return palindromeRecursive(str,left+1,right-1);
     }

     public static void main(String[] args) {
        String str = "adam";
        System.out.println("Is palindrome: " + plaindrome(str));
    }
}
