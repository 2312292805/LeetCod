package Jun12;

import java.util.Arrays;

public class EX3 {
    public int distributeCookies(int[] cookies, int k) {
        Arrays.sort(cookies);
        if(cookies.length==k){
            return cookies[cookies.length-1];
        }
    }
}
class Solution {
    int res, n, k;
    public int distributeCookies(int[] cookies, int _k) {
        k = _k;
        res = Integer.MAX_VALUE;
        int[] basket = new int[k];
        n = cookies.length;
        dfs(cookies, 0, basket);
        return res;
    }
    private void dfs(int[] cookies, int i, int[] basket) {
        int max = Arrays.stream(basket).max().orElse(-1);
        if(max >= res){ return;}
        if (i == n) {
            res = Math.min(res, max);
            return;
        }
        for (int j = 0; j < k; j++) {
            int[] clone = basket.clone();
            clone[j] += cookies[i];
            dfs(cookies, i + 1, clone);
        }
    }
}

