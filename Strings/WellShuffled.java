package Strings;
import java.util.Scanner;

public class WellShuffled {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int n=s1.length();
        int m=s2.length();
        in.close();
    }
    //Check whether a string is a valid shuffle of two strings or not
    static boolean checkShuffle(String s1,String s2,String res){
        if(s1.length()+s2.length()!=res.length())
            return false;
        int i=0,j=0,k=0;
        while(k<res.length()){
            if(i<s1.length() && s1.charAt(i)==res.charAt(k))
                i++;
            else if(j<s2.length() && s2.charAt(j)==res.charAt(k))
                j++;
            else
                return false;
            k++;
        }
        if(i<s1.length() || j<s2.length())
            return false;
        return true;
    }
}
