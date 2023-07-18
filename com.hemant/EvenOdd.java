import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(isOdd(n));
        read.close();
    }

    public static boolean isOdd(int n) {
        if ((n & 1) == 1) {
            System.out.println(n+" Number is Odd.");
            return true;
        }
        return false;
    }
}
