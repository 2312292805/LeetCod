package Jun12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EX2 {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int res=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<grid[0].length;i++){
            res=0;
            for(int j=0;j<grid.length;j++){
                res+=moveCost[grid[j][i]][j]+grid[i][j];
            }
            list.add(res);
        }
        Collections.sort(list);
        return list.get(0);
    }
}
class Solution {
    public int minPathCost(int[][] g, int[][] moveCost) {
        int m = g.length, n = g[0].length;
        int[][] f = new int[m][n];
        for (int i = 0; i < n; i++) {
            f[0][i] = g[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    tmp = Math.min(tmp, f[i - 1][k] + moveCost[g[i - 1][k]][j]);//上一行路径最小值
                }
                f[i][j] = tmp + g[i][j];//加上当前位置的值
            }
        }
        return Arrays.stream(f[m - 1]).min().orElse(-1);
    }
}


