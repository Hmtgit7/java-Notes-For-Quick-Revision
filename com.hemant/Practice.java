import java.util.Arrays;

public class Practice{
    public static void main(String[] args){
        int a=10; int b=20;
        int[] arr={1,2,4,5};
        System.out.println(Arrays.toString(arr));
        
        updateArray(arr);
        System.out.println(Arrays.toString(arr));
        assignValue(a,b);
        System.out.println(a);
    }
    static void assignValue(int a , int b){
        a=30;
        System.out.println(a);
    }
    static void updateArray(int[] arrr){
        arrr[0]=99;
    }
}