public class SetBitCounter {
    public static void main(String[] args) {
        int n=11;
        int counter=0;

        while (n>0){
            if((n&1)==1){
                counter++;
            }
            n=n>>1;
        }
        System.out.println(counter);
    }
}


/*
 *      1 0 0 
 *      0 0 1 
 * AND  0 0 0
 * XOR  1 0 1
 * OR   1 0 1
 */