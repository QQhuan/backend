public class Solution {
    public static boolean backspaceCompare(String s, String t) {
        int i = s.length()-1, j = t.length()-1;
        while(i >= 0 && j >= 0) {
            int index = 0;
            while(i >= 0 && s.charAt(i) == '#') {
                index++;
                i--;
            }
            i -= index;
            index = 0;
            while(j >= 0 && t.charAt(j) == '#') {
                index++;
                j--;
            }
            j -= index;

            if(i < 0 && j < 0) return true;

            if(i >= 0 && s.charAt(i) == '#') continue;
            if(j >= 0 && t.charAt(j) == '#') continue;
            if(i < 0 || j < 0 || s.charAt(i) != t.charAt(j)) {
                return false;
            }
            i--;
            j--;
        }
        if(i >= 0 || j >= 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] param) {
        String s = "ab##", t = "c#d#";
        backspaceCompare(s, t);
    }
}
