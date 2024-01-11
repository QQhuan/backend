public class SearchMartix {
    public static boolean search(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m-1;
        while(left <= right) {
            if(left == right) {
                int i = 0, j = n-1;
                while(i <= j) {
                    int t = (i+j)/2;
                    if(matrix[left][t] == target) {
                        return true;
                    } else if(target < matrix[left][t]) {
                        j = t-1;
                    } else {
                        i = t+1;
                    }
                }
                return false;
            }
            int mid = (int)Math.ceil((left+right)/2.0);
            if(matrix[mid][0] == target) {
                return true;
            } else if(target < matrix[mid][0]) {
                right = mid-1;
            } else {
                left = mid; // 切记不能+1
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean res = search(test, 3);
        System.out.println(res);
    }
}
