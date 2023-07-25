import java.util.*;
public class Subset {
    public static void main(String[] args)
    {
        String s="1234";
        subsets2("",s);
    }
    public static ArrayList<String> subsets(String s){
        ArrayList<String> ans=new ArrayList<>();

        if(s.isEmpty()){
            System.out.println(ans);

        }
        return ans;
    }
    static void subsets2(String result,String s){
        if(s.isEmpty()){
            System.out.println(result);
            return;
        }

        char ch=s.charAt(0);

        subsets2(result+ch, s.substring(1));
        subsets2(result,s.substring(1));
    }
}
