package Dec12;

import java.util.Arrays;

public class EX2 {
    public long subArrayRanges(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            for(int j=1;j<nums.length;j++){
                sum+=nums[i+j]-nums[i];
                if(i+j>nums.length){
                    break;
                }
            }
        }
        return sum;
    }
}
