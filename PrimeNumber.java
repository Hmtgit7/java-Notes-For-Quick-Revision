public class PrimeNumber{
    public static void main(String[] args){
        
    }
    static boolean isPrime(int n){
        if(n<=0){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0) return false;
            c++;
        }
        return true;
    }
}