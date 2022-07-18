package Mat6;

import java.util.Arrays;

public class EX2 {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int len=nums.length;
        int re=nums[len-1];
        long res=0;
        int count=0;
        for(int i=1;i<re;i++){
            for(int j=nums[i-1];j<nums[i];j++){
                res+=j;
                count++;
                if(count==k){
                    break;
                }
            }
            break;
        }
        return res;
    }
}
class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);

        long ans = 0, start = 1;
        for (int i = 0; i < nums.length && k > 0; i++) {
            // 存在未出现的数字
            if (start < nums[i]) {
                int cnt = (int) (nums[i] - start) > k ? k : (int) (nums[i] - start);
                // 不存在的数据累计
                ans += (2L * start + cnt - 1) * cnt / 2;
                k -= cnt;
            }
            start = nums[i] + 1;
        }
        // 不存在的数据累计
        if (k > 0) {
            ans += (2L * start + k - 1) * k / 2;
        }
        return ans;
    }
}
