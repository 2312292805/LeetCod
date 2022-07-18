package Nov17;

import java.util.ArrayList;
/*
����һ�� ����?ͼ��ͼ���� n?���ڵ㣬�ڵ��Ŵ� 0?�� n - 1?������������ͬʱ����һ���±�� 0?��ʼ����������?values?������?values[i]?�ǵ� i?���ڵ�� ��ֵ?��ͬʱ����һ���±�� 0?��ʼ�Ķ�ά��������?edges?������?edges[j] = [uj, vj, timej]?��ʾ�ڵ�?uj ��?vj?֮����һ����Ҫ?timej?�����ͨ��������ߡ���󣬸���һ������?maxTime?��

�Ϸ�·��?ָ����ͼ������һ���ӽڵ�?0?��ʼ�����ջص��ڵ� 0?���һ��ѵ���ʱ�� ������?maxTime ���һ��·��������Է���һ���ڵ�����Ρ�һ���Ϸ�·���� ��ֵ?����Ϊ·���� ��ͬ�ڵ�?�ļ�ֵ ֮��?��ÿ���ڵ�ļ�ֵ ����?�����ֵ�ܺ���һ�Σ���

���㷵��һ���Ϸ�·���� ���?��ֵ��

ע�⣺ÿ���ڵ� ����?�� ����?����֮������

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/maximum-path-quality-of-a-graph
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
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
