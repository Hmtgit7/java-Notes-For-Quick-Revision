public class RecursionPrintNumber{
    public static void main(String[] args) {
     int n=5;
     fun(n);   
     funRev(n);
     funRevStart(n);
    }
    static void fun(int n){
        if(n==0) return;
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if(n==0) return;
        funRev(n-1);
        System.out.println(n);
    }
    static void funRevStart(int n){
        if(n==0) return;
        System.out.println(n);
        funRevStart(n-1);
        System.out.println(n);
    }
}