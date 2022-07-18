package NOV28;

import java.util.ArrayList;
/*
5939. 半径为 k 的子数组平均值
给你一个下标从 0 开始的数组 nums ，数组中有 n 个整数，另给你一个整数 k 。

半径为 k 的子数组平均值 是指：nums 中一个以下标 i 为 中心 且 半径 为 k 的子数组中所有元素的平均值，即下标在 i - k 和 i + k 范围（含 i - k 和 i + k）内所有元素的平均值。如果在下标 i 前或后不足 k 个元素，那么 半径为 k 的子数组平均值 是 -1 。

构建并返回一个长度为 n 的数组 avgs ，其中 avgs[i] 是以下标 i 为中心的子数组的 半径为 k 的子数组平均值 。

x 个元素的 平均值 是 x 个元素相加之和除以 x ，此时使用截断式 整数除法 ，即需要去掉结果的小数部分。

例如，四个元素 2、3、1 和 5 的平均值是 (2 + 3 + 1 + 5) / 4 = 11 / 4 = 3.75，截断后得到 3 。


示例 1：



输入：nums = [7,4,3,9,1,8,5,2,6], k = 3
输出：[-1,-1,-1,5,4,4,-1,-1,-1]
解释：
- avg[0]、avg[1] 和 avg[2] 是 -1 ，因为在这几个下标前的元素数量都不足 k 个。
- 中心为下标 3 且半径为 3 的子数组的元素总和是：7 + 4 + 3 + 9 + 1 + 8 + 5 = 37 。
  使用截断式 整数除法，avg[3] = 37 / 7 = 5 。
- 中心为下标 4 的子数组，avg[4] = (4 + 3 + 9 + 1 + 8 + 5 + 2) / 7 = 4 。
- 中心为下标 5 的子数组，avg[5] = (3 + 9 + 1 + 8 + 5 + 2 + 6) / 7 = 4 。
- avg[6]、avg[7] 和 avg[8] 是 -1 ，因为在这几个下标后的元素数量都不足 k 个。
示例 2：

输入：nums = [100000], k = 0
输出：[100000]
解释：
- 中心为下标 0 且半径 0 的子数组的元素总和是：100000 。
  avg[0] = 100000 / 1 = 100000 。
示例 3：

输入：nums = [8], k = 100000
输出：[-1]
解释：
- avg[0] 是 -1 ，因为在下标 0 前后的元素数量均不足 k 。
 */
public class EX2 {
    public int[] getAverages(int[] nums, int k) {
        /*int len=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        if(len<=2*k){
            for(int i=0;i<len;i++){
                list.add(-1);
            }
        }
        for(int i=0;i<k;i++){
            list.add(-1);
        }

        for(int i=k;i<len-k;i++){
            sum=0;
            for(int j=i-k;j<=i+k;j++){
                sum+=nums[j];
            }
            sum=sum/(2*k+1);
            list.add(sum);
        }
        for(int i=len;i>len-k;i--){
            list.add(-1);
        }
        int[] num=new int[nums.length];
        for(int i=0;i<len;i++){
            num[i]=list.get(i);
        }
        return num;
        int len=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        long sum=0;
        long count=0;
        if(len<=2*k){
            for(int i=0;i<len;i++){
                list.add(-1);
            }
        }
        for(int i=0;i<k;i++){
            list.add(-1);
        }
        for(int i=0;i<2*k+1;i++){
            sum+=nums[i];
        }
        for(int i=0;i<len-k;i++){
            count=sum/(2*k+1);
            list.add((int)count);
            sum-=nums[i];
            sum+=nums[i+2*k];
        }

        for(int i=len;i>len-k;i--){
            list.add(-1);
        }
        int[] num=new int[nums.length];
        for(int i=0;i<len;i++){
            num[i]=list.get(i);
        }
        return num;
        int len=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        long sum=0;
        long count=0;
        if(len<=2*k){
            for(int i=0;i<len;i++){
                list.add(-1);
            }
        }
        for(int i=0;i<k;i++){
            list.add(-1);
        }
        for(int i=0;i<2*k+1;i++){
            sum+=nums[i];
        }
        for(int i=k;i<len-k;i++){
            count=sum/(2*k+1);
            list.add((int)count);
            sum-=nums[i-k];
            sum+=nums[i+k+1];
        }

        for(int i=len;i>len-k;i--){
            list.add(-1);
        }
        int[] num=new int[nums.length];
        for(int i=0;i<len;i++){
            num[i]=list.get(i);
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        EX2 ex=new EX2();
        ex.getAverages(arr,2);*/

    }
}
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int len = nums.length, sub = 2 * k + 1;
        long[] presum = new long[len + 1];
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            presum[i + 1] = presum[i] + nums[i];
        }
        for (int i = 0; i < len; i++) {
            if (i - k < 0 || i + k >= len) {
                result[i] = -1;
            } else {
                int start = i - k, end = i + k;
                result[i] = (int)((presum[end + 1] - presum[start]) / sub);
            }
        }
        return result;
    }
}
