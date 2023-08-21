package Strings;
public class CountAndSay {
    public static void main(String[] args){
        System.out.println(countAndSay(5));
        System.out.println(countAndSay2(5));
    }
    public static String countAndSay(int n){
        if(n==1) return "1";
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                sb.append(count);
                sb.append(s.charAt(i));
                count = 1;
            }else{
                count++;
            }
        }
        return sb.toString();
    }
    public static String countAndSay2(int n){
        if(n==1) return "1";
        if(n==2) return "11";
        String s = "11";
        for(int i=3;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=0;j<s.length();j++){
                if(j==s.length()-1 || s.charAt(j)!=s.charAt(j+1)){
                    sb.append(count);
                    sb.append(s.charAt(j));
                    count = 1;
                }else{
                    count++;
                }
            }
            s = sb.toString();
        }
        return s;
    }
}
