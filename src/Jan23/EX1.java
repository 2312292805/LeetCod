package Jan23;

import java.util.Arrays;

public class EX1 {
    public static int countElements(int[] nums) {

        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        /*if(n<3){
            return 0;
        }
        for(int i=1;i<n-1;i++){
            if(nums[0]==nums[i]){
                i++;
            }
            else if(nums[n-1]==nums[i]){
                break;
            }
            else{
                count++;
            }

        }
        return  count;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{739,-458,162,-458,162,-458,-458,-458,-458,162,162,162,162,162,162,162,162,-458,162,582,162,-458};
        int a=0;
        a=countElements(nums);
        System.out.println(a);*/
        int left=1,right=n-1;
            while(nums[0]==nums[left]){
                left++;
            }
            while(nums[n-1]==nums[right]){
                right--;
            }
        return right-left+1;
    }
}
