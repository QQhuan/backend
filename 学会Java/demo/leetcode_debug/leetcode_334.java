public class leetcode_334 {
    public leetcode_334() {

    }

    /*
    * 解法二：贪心法
    * 定义俩变量，first与second
    * first初始化为nums[0]，second初始化为极大值
    * 从左往右遍历：当前值为cur
    * if cur > second，则找到三元组，返回true
    * elif cur > first and cur < second，则将second赋值为cur
    * else cur < first，则令first = cur 【注：此时，second的index < first，但没关系，因为first中存了最小值，不会影响后续遍历的判断】
    * */
    public static boolean increasingTriplet2(int[] nums) {
        int n = nums.length;
        if(n < 3) return false;

        int first = nums[0], second = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            int cur = nums[i];
            if(cur > second) {
                return true;
            } else if (cur < second && cur > first) {
                second = cur;
            } else  {
                first = cur;
            }
        }
        return false;
    }

    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3) return false;
        int[] dp_min = new int[n];
        dp_min[0] = nums[0];
        for(int i = 1; i < n; i++) {
            dp_min[i] = (int)Math.min(nums[i], dp_min[i-1]);
        }

        int[] dp_max = new int[n];
        dp_max[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--) {
            dp_max[i] = (int)Math.max(nums[i], dp_max[i+1]);
        }

        for(int i = 1; i < n-1; i++) {
            if(nums[i] != dp_max[i] && nums[i] != dp_min[i] && nums[i] < dp_max[i] && nums[i] > dp_min[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = new int[]{5,1,5,5,2,5,4};
        boolean res = increasingTriplet2(input);
        System.out.println(res);
    }
}
