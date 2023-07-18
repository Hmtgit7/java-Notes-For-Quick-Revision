public class PowerOfTwo {
    public static void main(String[] args) {
        int n=21;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n){
        if((n & (n-1))==0) return true;
        return false;
    }
}

/* 
4= 0 1 0 0
3= 0 0 1 1
2= 0 0 1 0
   0 0 1 0
   */