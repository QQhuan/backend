import java.util.Random;
import java.util.Scanner;

public class RandomCode {
    /*
    * 随机生成随机验证码
    * */
    private static String getCode() {
        String res = "";
        char[] ch_set = new char[26+26+10];
        int k = 0;
        for(char x = 'a'; x <= 'z'; x++) {
            ch_set[k++] = x;
        }
        for(char x = 'A'; x <= 'Z'; x++) {
            ch_set[k++] = x;
        }
        for(char x = '0'; x <= '9'; x++) {
            ch_set[k++] = x;
        }

        Random r = new Random();
        for(int i = 0; i <= 5; i++) {
            int index = r.nextInt(ch_set.length); // 产生[0, n)的随机整数
            res += ch_set[index];
        }
        return res;
    }

    public static void main(String[] args) {
        String code = getCode();
        System.out.println("产生的验证码为："+code);
        Scanner sc = new Scanner(System.in);
        String inputCode = sc.next(); // 用户输入的验证码
        if(inputCode.equalsIgnoreCase(code)) {
            System.out.println("验证成功！");
        } else {
            System.out.println("验证失败！");
        }
    }
}
