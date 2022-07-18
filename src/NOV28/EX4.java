package NOV28;

import java.util.*;

/*
5941. 找出知晓秘密的所有专家  显示英文描述
User Accepted: 639
User Tried: 1807
Total Accepted: 744
Total Submissions: 5524
Difficulty: Hard
给你一个整数 n ，表示有 n 个专家从 0 到 n - 1 编号。另外给你一个下标从 0 开始的二维整数数组 meetings ，其中 meetings[i] = [xi, yi, timei] 表示专家 xi 和专家 yi 在时间 timei 要开一场会。一个专家可以同时参加 多场会议 。最后，给你一个整数 firstPerson 。

专家 0 有一个 秘密 ，最初，他在时间 0 将这个秘密分享给了专家 firstPerson 。接着，这个秘密会在每次有知晓这个秘密的专家参加会议时进行传播。更正式的表达是，每次会议，如果专家 xi 在时间 timei 时知晓这个秘密，那么他将会与专家 yi 分享这个秘密，反之亦然。

秘密共享是 瞬时发生 的。也就是说，在同一时间，一个专家不光可以接收到秘密，还能在其他会议上与其他专家分享。

在所有会议都结束之后，返回所有知晓这个秘密的专家列表。你可以按 任何顺序 返回答案。



示例 1：

输入：n = 6, meetings = [[1,2,5],[2,3,8],[1,5,10]], firstPerson = 1
输出：[0,1,2,3,5]
解释：
时间 0 ，专家 0 将秘密与专家 1 共享。
时间 5 ，专家 1 将秘密与专家 2 共享。
时间 8 ，专家 2 将秘密与专家 3 共享。
时间 10 ，专家 1 将秘密与专家 5 共享。
因此，在所有会议结束后，专家 0、1、2、3 和 5 都将知晓这个秘密。
示例 2：

输入：n = 4, meetings = [[3,1,3],[1,2,2],[0,3,3]], firstPerson = 3
输出：[0,1,3]
解释：
时间 0 ，专家 0 将秘密与专家 3 共享。
时间 2 ，专家 1 与专家 2 都不知晓这个秘密。
时间 3 ，专家 3 将秘密与专家 0 和专家 1 共享。
因此，在所有会议结束后，专家 0、1 和 3 都将知晓这个秘密。
示例 3：

输入：n = 5, meetings = [[3,4,2],[1,2,1],[2,3,1]], firstPerson = 1
输出：[0,1,2,3,4]
解释：
时间 0 ，专家 0 将秘密与专家 1 共享。
时间 1 ，专家 1 将秘密与专家 2 共享，专家 2 将秘密与专家 3 共享。
注意，专家 2 可以在收到秘密的同一时间分享此秘密。
时间 2 ，专家 3 将秘密与专家 4 共享。
因此，在所有会议结束后，专家 0、1、2、3 和 4 都将知晓这个秘密。
示例 4：

输入：n = 6, meetings = [[0,2,1],[1,3,1],[4,5,1]], firstPerson = 1
输出：[0,1,2,3]
解释：
时间 0 ，专家 0 将秘密与专家 1 共享。
时间 1 ，专家 0 将秘密与专家 2 共享，专家 1 将秘密与专家 3 共享。
因此，在所有会议结束后，专家 0、1、2 和 3 都将知晓这个秘密。


提示：

2 <= n <= 105
1 <= meetings.length <= 105
meetings[i].length == 3
0 <= xi, yi <= n - 1
xi != yi
1 <= timei <= 105
1 <= firstPerson <= n - 1

 */
public class EX4 {
}
class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(firstPerson);
        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);
        int len = meetings.length, preTime = meetings[0][2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i <= len; i++) {
            if (i == len || meetings[i][2] != preTime) {
                Queue<Integer> que = new LinkedList<>();
                for (int key : map.keySet()) {
                    if (set.contains(key)) {
                        que.offer(key);
                    }
                }
                while (!que.isEmpty()) {
                    int cur = que.poll();
                    for (int next : map.get(cur)) {
                        if (!set.contains(next)) {
                            set.add(next);
                            que.offer(next);
                        }
                    }
                }
                map.clear();

            }

            if (i < len){
                preTime = meetings[i][2];
                int[] meeting = meetings[i];
                int from = meeting[0], to = meeting[1], time = meeting[2];
                List<Integer> list1 = map.computeIfAbsent(from, t -> new ArrayList<>());
                List<Integer> list2 = map.computeIfAbsent(to, t -> new ArrayList<>());
                list1.add(to);
                list2.add(from);
            }

        }
        return new ArrayList<>(set);
    }
}
