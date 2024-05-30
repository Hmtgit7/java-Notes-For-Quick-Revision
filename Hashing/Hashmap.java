package Hashing;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("abc", 10);
        map.put("def", 20);
        map.put("ghi", 30);
        map.put("jkl", 40);

        System.out.println(map);
    }
}
