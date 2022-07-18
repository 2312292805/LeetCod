package Jul17;

import java.util.Arrays;

public class EX1 {
    public int[] numberOfPairs(int[] nums) {
        int[] res=new int[2];
        int res1=0;
        int res2=0;
        int[] re=new int[100];
        for(int i=0;i<nums.length;i++){
            re[nums[i]]++;
        }
        for(int i=0;i<re.length;i++){
            if(re[i]!=0&&re[i]%2==0){
                res1+=res[i]%2;
            }
            if(re[i]!=0&&re[i]%2!=0){
                res1+=re[i]/2;
                res2+=1
            }
        }
    res[0]=res1;
        res[1]=res[2];
        return res;
    }
}
