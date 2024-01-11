import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
//        String[] arr = {"aas", "dfs"};
//        int[] a = {1, 2, 3, 5};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(a));
          double[][] m1 = new double[][]{{-1081.9475, -1316.468},
                  {-1014.9309, -230.6005},
                  {-233.0558, -242.2891},
                  {-233.9132, -1013.0885}};
        double[][] m2 = new double[][]{{-54.2195, -54.8262},
                {-55.8754, 368.8133},
                {266.6385, 359.6714},
                {259.0508, -53.1694}};

          String[] lines = new String[]{"AB","BC","CD","DA","EF","FG","GH","HE"};
          int k = 0;
          int l = 1;
          while(l <= 2) {
              double[][] m;
              if(l == 2) {
                  m = m2;
              } else {
                  m = m1;
              }
              for (int i = 0; i < m.length; i++) {
                  double x1 = m[i][0], y1 = m[i][1];
                  int j = (i + 1) % (m.length);
                  double x2 = m[j][0], y2 = m[j][1];
                  double result = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
                  System.out.println(lines[k++] + ":");
                  System.out.printf("%.2f%n", result);
              }
              l++;
          }
    }
}
