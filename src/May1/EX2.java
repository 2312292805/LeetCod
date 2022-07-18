package May1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EX2 {
    public int minimumCardPickup(int[] cards) {
        /*int len=cards.length;
        int count=Integer.MAX_VALUE;
        int res=Integer.MAX_VALUE;
        int index=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<len;i++){
            index=i;
            set.clear();
            while(!set.contains(cards[i])){
                set.add(cards[index]);
                index++;
            }
            count=set.size();
            res=Math.min(count,res);
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;*/

            static int[] indexs = new int[1000001];

            public int minimumCardPickup(int[] cards) {
                int min = Integer.MAX_VALUE, n = cards.length;
                Arrays.fill(indexs, -1);
                for (int i = 0; i < n; i++) {
                    if (indexs[cards[i]] >= 0) {
                        min = Math.min(min, i - indexs[cards[i]] + 1);
                    }
                    indexs[cards[i]] = i;
                }
                return min == Integer.MAX_VALUE ? -1 : min;
            }
        }
    }
}
