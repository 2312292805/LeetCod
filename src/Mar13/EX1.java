package Mar13;

import java.util.*;

public class EX1 {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==key){
                for(int j=i-1;j>=i-k&&j>=0;j--){
                    list.add(j);

                }
                for(int j=i+1;j<=i+k&&j<len;j++){
                    list.add(j);
                }
            }
        }
        int[] num=new int[list.size()];
        for(int i=0;i<list.size();i++){
            num[i]=set
        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            list1.add(num[i]);
        }
        return list1;
    }
}
