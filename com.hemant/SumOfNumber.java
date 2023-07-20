public class SumOfNumber {
    public static void main(String[] args){
        int n=12345;
        sumOfNumber(n);
    }
    public static int sumOfNumber(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfNumber(n/10);
    }
}