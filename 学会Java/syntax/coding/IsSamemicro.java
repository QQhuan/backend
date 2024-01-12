import java.util.HashMap;
import java.util.Map;

public class IsSamemicro {
    public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        Map<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < n; i++) {
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);
            if(map.containsKey(s_ch)) {
                char map_value = map.get(s_ch);
                if(map_value != t_ch) {
                    return false;
                }
            } else {
                if(map.containsValue(t_ch)) {
                    return false;
                }
                map.put(s_ch, t_ch);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String f = "badc";
        String b = "baba";
        System.out.println(isIsomorphic(f, b));
    }
}
