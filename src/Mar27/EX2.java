package Mar27;

import java.util.ArrayList;

public class EX2 {
    public int minDeletion(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            num.add(nums[i]);
        }
        for (int i = 0; i <num.size()-1 ; i++) {
            if(i%2==0&&num.get(i)==num.get(i+1)){
                num.remove(i);
            }
            list.add(num.get(i));
        }
        if(list.size()%2!=0){
            list.add(nums[nums.length-1]);
        }
        return nums.length-list.size();
    }
}
