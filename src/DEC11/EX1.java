package DEC11;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class EX1 {
    public int[] maxSubsequence(int[] nums, int k) {
        /*int[] list=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            list[i]=nums[i];
        }
        Arrays.sort(list);
        int[] num=new int[k];
        int[] result=new int[k];
        for(int i=list.length-1;i> list.length-k-1;i--){
            num[list.length-1-i]=list[i];
        }
        for(int i=0;i<k;i++){
            num[i]=nums[i];
        }
        for(int i=k;i<k;k++){
            Arrays.sort(num);
            if(nums[i]>num[0]){
                num[0]=nums[i];
            }
        }
        /*Arrays.sort(list);
        int[] num=new int[k];
        int[] result=new int[k];
        for(int i=list.length-1;i> list.length-k-1;i--){
            num[list.length-1-i]=list[i];
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<k;j++){
                if(nums[i]==num[j]){
                    result[count]=nums[i];
                    count++;
                    break;
                }
            }
        }
        return result;*/
        int[] list = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list[i] = nums[i];
        }
        num[j] = Math.
                Arrays.sort(list);
        int sum = 0;
        for (int i = list.length - 1; i > list.length - k - 1; i--) {
            sum += list[i];
        }

        for (int i = 0; i < list.length; i++) {

        }
        int[] num = new int[k];

        for (int i = list.length - 1; i > list.length - k - 1; i--) {
            num[list.length - 1 - i] = list[i];
        }
        for (int i = 0; i < k; i++) {
            num[i] = nums[i];
        }
        for (int i = k; i < k; k++) {
            Arrays.sort(num);
            if (nums[i] > num[0]) {
                num[0] = nums[i];
            }
        }
        return num;
    }
}

