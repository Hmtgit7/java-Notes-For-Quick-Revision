public class ReverseNumber {
    public static void main(String[] args){
        int n= 48783;
        reverseNumber(n);
    }
    static void reverseNumber(int n){
        if(n==0){
            return;
        }
        int m=n%10;
        System.out.print(m);
        reverseNumber(n/10);
    }
    static int sum = 0;
    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }
    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
