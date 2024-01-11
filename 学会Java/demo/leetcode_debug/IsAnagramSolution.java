import java.util.HashMap;
import java.util.Map;

public class IsAnagramSolution {

    public static boolean isAnagram(String s, String t) {
        int len_s = s.length();
        int len_t = t.length();
        if(len_s != len_t) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < len_s; i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count+1); // 计数加一
            } else {
                map.put(ch, 1);
            }
        }
        for(int i = 0; i < len_t; i++) {
            char ch = t.charAt(i);
            if(map.containsKey(ch)) {
                int count = map.get(ch);
                if(count <= 0) {
                    return false;
                } else {
                    map.put(ch, count-1); // 计数减一
                }
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean res = isAnagram("anagram","nagaram");
        System.out.println(res);
    }
}
