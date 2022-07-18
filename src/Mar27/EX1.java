package Mar27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EX1 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new List<List<Integer>>();
        Set<Integer> list1=new HashSet<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums1.length;i++){
            count=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]!=nums2[j]){
                    count++;
                }
                if(count==nums2.length){
                    list1.add(nums1[i]);
                }
            }
        }
        for (int i = 0; i <nums2.length ; i++) {
            count=0;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]!=nums2[j]){
                    count++;
                }
                if(count==nums1.length){
                    list2.add(nums2[i]);
                }
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
}
