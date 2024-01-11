public class IntegerTest {
    public static void main(String[] args) {
//        Integer x = new Integer(123);
//        Integer y = new Integer(123);
//        System.out.println(x == y);    // false
//        Integer z = Integer.valueOf(123);
//        Integer k = Integer.valueOf(123);
//        System.out.println(z == k);   // true
//        Integer a = 121;
//        Integer b = 121;
//        System.out.println(a==b); // true
//        Integer c = 200;
//        Integer d = 200;
//        System.out.println(c==d); // false，注意int的取值范围，常量缓存池，-128~127之间
        /**
         * Java的Integer缓存池是一个范围为-128到127的整数对象池。
         * 当使用Integer.valueOf()方法创建Integer对象时，如果值在这个范围内，
         * 就会直接返回缓存池中的对象，而不是创建新的对象。
         */
        System.out.println(9 / 2);
    }
}
