import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n= read.nextInt();
        System.out.println(fibonacci(n));
        read.close();
    }
    public static int fibonacci(int n){
        if(n<2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
