package Mat5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class EX1 {
    public int mostFrequent(int[] nums, int key) {
        int couny=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                list.add(nums[i+1]);
            }
        }
        int[] num=new int[list.size()];
        for(int i=0;i<list.size();i++){
            num[i]=list.get(i);
        }
        Arrays.sort(num);
        int re=0;
        int count=0;
        int max=0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                if(num[j]!=num[i]){
                    count=j-i;
                }
                if(count>max){
                    re=num[i];
                }
            }
            max=Math.max(max,count);
        }
        return re;
    }
}
