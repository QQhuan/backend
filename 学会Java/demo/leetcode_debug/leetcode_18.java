import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // 先排个序
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            // 剪枝
            if(nums[i] > 0 && nums[i] > target) {
                return res;
            }

            // 去重
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            for(int j = i+1; j < len; j++) {
                // 底层剪枝
                /*
                千万不能在此剪枝，因为nums[i]可能已经是负数
                if(nums[j] > 0 && nums[j] > target) {
                    break;
                }
                */

                // 第二个数的去重
                if(j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }

                int left = j+1;
                int right = len-1;
                while(left < right) { // 注意此处不能用等于号
                    if(nums[i] + nums[j] + nums[left] + nums[right] == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[right] == nums[right-1]) right--;
                        while(left < right && nums[left] == nums[left+1]) left++;
                        right--;
                        left++;
                    } else if(nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = fourSum(new int[]{-3,1,1,1}, 0);
        System.out.println(res);
    }
}
