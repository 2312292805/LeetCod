package Nov21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
5186. 区间内查询数字的频率
请你设计一个数据结构，它能求出给定子数组内一个给定值的 频率 。

子数组中一个值的 频率 指的是这个子数组中这个值的出现次数。

请你实现 RangeFreqQuery 类：

RangeFreqQuery(int[] arr) 用下标从 0 开始的整数数组 arr 构造一个类的实例。
int query(int left, int right, int value) 返回子数组 arr[left...right] 中 value 的 频率 。
一个 子数组 指的是数组中一段连续的元素。arr[left...right] 指的是 nums 中包含下标 left 和 right 在内 的中间一段连续元素。



示例 1：

输入：
["RangeFreqQuery", "query", "query"]
[[[12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56]], [1, 2, 4], [0, 11, 33]]
输出：
[null, 1, 2]

解释：
RangeFreqQuery rangeFreqQuery = new RangeFreqQuery([12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56]);
rangeFreqQuery.query(1, 2, 4); // 返回 1 。4 在子数组 [33, 4] 中出现 1 次。
rangeFreqQuery.query(0, 11, 33); // 返回 2 。33 在整个子数组中出现 2 次。


提示：

1 <= arr.length <= 105
1 <= arr[i], value <= 104
0 <= left <= right < arr.length
调用 query 不超过 105 次。
 */
public class EX3 {


}
class RangeFreqQuery {
    Map<Integer, List<Integer>> map;
    public RangeFreqQuery(int[] arr) {
        int len = arr.length;
        map = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            map.putIfAbsent(arr[i] , new ArrayList<>());
            map.get(arr[i]).add(i);
        }
    }

    public int query(int left, int right, int value) {
        if(!map.containsKey(value)) return 0;
        List<Integer> list = map.get(value);
        int rIdx = getIdx(list , right);
        int lIdx = getIdx(list , left-1);
        return rIdx - lIdx;
    }
    int getIdx(List<Integer> list , int t){
        int l = 0 , r = list.size()-1;
        while(l <= r){
            int mid = (l+r)>>1;
            int v = list.get(mid);
            if(v == t){
                return mid;
            }else if(v < t){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return r;
    }
}

/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */

