package Strings;
/**
 * IsAnagram
 */
public class IsAnagram {
    public static void main(String[] args) {
        String a="final";
        String b="nialf";
        System.out.println(isAnagram(a,b));
    }
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int[] arr=new int[256];
        for(int ch : a.toCharArray()){
            arr[ch]++;
        }
        for (int ch:b.toCharArray()){
            arr[ch]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;

        // for(int i=0;i<a.length();i++){
        //     arr[a.charAt(i)-'a']++;
        //     arr[b.charAt(i)-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]!=0){
        //         return false;
        //     }
        // }
        // return true;
    }
}