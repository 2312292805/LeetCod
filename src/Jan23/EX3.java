package Jan23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX3 {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=1;i< nums.length-1;i++){
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]&&nums[i]!=nums[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
