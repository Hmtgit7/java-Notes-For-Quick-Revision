package Strings;

public class IsPalindrome {
    public static void main(String[] args){
        String x = "abba";
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(String x) {
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
