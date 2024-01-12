public class StringTest {
    public static void main(String[] args) {
//        String s = "hello";
//        System.out.println(s);
//        s = "world";
//        System.out.println(s);
        int a = 72;
        int b = 105;
        int c = 65281;
        // FIXME:
        // String s = String.valueOf(a)+String.valueOf(b)+String.valueOf(c);
        // String s = String.valueOf(a)+String.valueOf(b)+String.valueOf(c);
        char charA = (char)a; // 这样是转为Unicode编码字符，并不是“72”，而是’H‘
        char charB = (char)b;
        char charC = (char)c;
        System.out.println(charA);
        String s = ""+charA+charB+charC;
        System.out.println(s);
    }
}
