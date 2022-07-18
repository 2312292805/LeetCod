package Apr2;

import java.util.ArrayList;
import java.util.Arrays;

public class EX2 {
    public int triangularSum(int[] nums) {
        int len = nums.length;
        int k = 0;
        int res=0;

        while (nums.length - k == 1) {
            int[] n = new int[nums.length - k];
            for (int i = 0; i < n.length; i++) {
                n[i] = (nums[i] + nums[i + 1]) % 10;
            }
            if(n.length==1){
                res=n[0];
            }
        }
        return res;
    }
}
