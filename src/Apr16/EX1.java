package Apr16;

import java.util.Arrays;

public class EX1 {
    public int findClosestNumber(int[] nums) {
        int res=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            min=Math.abs(nums[i]);
            res=Math.min(min,res);
        }
        return res;
    }
}
