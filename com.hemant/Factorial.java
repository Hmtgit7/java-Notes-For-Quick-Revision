public class Factorial {
    public static void main(String[] args) {
        int n=0;
        int result=factorialOfNumber(n);   
        System.out.println(result);
    }
    public static int factorialOfNumber(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return n*factorialOfNumber(n-1);
    }
}
