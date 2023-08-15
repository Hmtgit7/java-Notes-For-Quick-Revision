package Strings;
import java.util.*;
public class RotatedString{
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String str1=read.nextLine();
        String str2=read.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("false");
            return;
        }
        isRotated(str1,str2);
    }
    public static void isRotated(String str1,String str2){
        String temp=str1+str1;
        if(temp.contains(str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}