package Jun26;

import java.util.ArrayList;
import java.util.Collections;

public class EX3 {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        /*ArrayList<Integer> list=new ArrayList<>();
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums1.length;i++){
            sum1+=nums1[i];
            sum2+=nums2[i];
        }
        list.add(sum1);
        list.add(sum2);
        for (int i = 0; i <nums1.length ; i++) {
            int diff=0;
            for (int j = 1; j <nums1.length ; j++) {
                if(nums1[0]>nums2[0]){
                    if(nums1[j]<nums2[j]){
                        diff+=nums2[j]-nums1[j];
                    }
                    if(diff<0){

                        break;
                    }
                }

            }
        }
*/
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<nums1.length;i++){
                int sum1=0;
                int sum2=0;
                for(int j=i;j<nums1.length;j++){
                    int temp=0;
                    temp=nums1[j];
                    nums1[j]=nums2[j];
                    nums1[j]=temp;
                }
                for(int k=0;k<nums1.length;k++){
                    sum1+=nums1[k];
                    sum2+=nums2[k];
                }
                list.add(Math.max(sum1,sum2));
            }
        Collections.sort(list);
            return list.get(list.size()-1);
    }
}
