package Jul17;

import java.util.ArrayList;
import java.util.Collections;

public class EX2 {
    public int maximumSum(int[] nums) {
        if(nums.length==1){
            return -1;
        }
        int res=-1;
        int[] num=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int re=0;
            while(nums[i]>0){
                re+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            num[i]=re;
        }
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(num[i]==num[j]){
                    list.add(nums[i]+nums[j]);
                }
            }
        }
        Collections.sort(list);
        return list.size()==0?-1:list.get(list.size()-1);
    }
}
