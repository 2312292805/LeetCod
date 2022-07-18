package Nov17;

import java.util.ArrayList;
/*
给你一张 无向?图，图中有 n?个节点，节点编号从 0?到 n - 1?（都包括）。同时给你一个下标从 0?开始的整数数组?values?，其中?values[i]?是第 i?个节点的 价值?。同时给你一个下标从 0?开始的二维整数数组?edges?，其中?edges[j] = [uj, vj, timej]?表示节点?uj 和?vj?之间有一条需要?timej?秒才能通过的无向边。最后，给你一个整数?maxTime?。

合法路径?指的是图中任意一条从节点?0?开始，最终回到节点 0?，且花费的总时间 不超过?maxTime 秒的一条路径。你可以访问一个节点任意次。一条合法路径的 价值?定义为路径中 不同节点?的价值 之和?（每个节点的价值 至多?算入价值总和中一次）。

请你返回一条合法路径的 最大?价值。

注意：每个节点 至多?有 四条?边与之相连。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-path-quality-of-a-graph
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class EX4 {
    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        ArrayList<int[]>[] list = new ArrayList[values.length];
        for (int i = 0; i < values.length; i++) {
            list[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            list[edge[0]].add(new int[] { edge[1], edge[2] });
            list[edge[1]].add(new int[] { edge[0], edge[2] });
        }
        return maximalPathQuality(0, maxTime, new int[values.length], values, list);
    }

    private int maximalPathQuality(int node, int time, int[] map, int[] values, ArrayList<int[]>[] list) {
        if (time < 0) {
            return Integer.MIN_VALUE;
        }
        int max = node > 0 ? Integer.MIN_VALUE : map[0] > 0 ? 0 : values[node];
        map[node]++;
        for (int[] next : list[node]) {
            max = Math.max(max, (map[node] > 1 ? 0 : values[node])
                    + maximalPathQuality(next[0], time - next[1], map, values, list));
        }
        map[node]--;
        return max;
    }
}
