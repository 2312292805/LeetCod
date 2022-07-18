package Nov13;
/*
5913. ����԰��ŵ����������Ŀ
���� n ������� m �����ˡ�ÿ��������Ҫһ��������ֵ������ɣ���Ҫ������ֵ�������±�� 0 ��ʼ���������� tasks �У��� i ��������Ҫ tasks[i] ������������ɡ�ÿ�����˵�����ֵ�������±�� 0 ��ʼ���������� workers �У��� j �����˵�����ֵΪ workers[j] ��ÿ������ֻ����� һ�� ����������ֵ��Ҫ ���ڵ��� �����������Ҫ��ֵ���� workers[j] >= tasks[i] ����

�������⣬�㻹�� pills ������ҩ�裬���Ը� һ�����˵�����ֵ ���� strength ������Ծ�������Щ����ʹ��ҩ�裬��ÿ������ ��� ֻ��ʹ�� һƬ ҩ�衣

�����±�� 0 ��ʼ����������tasks �� workers �Լ��������� pills �� strength �����㷵�� ��� �ж��ٸ�������Ա���ɡ�



ʾ�� 1��

���룺tasks = [3,2,1], workers = [0,3,3], pills = 1, strength = 1
�����3
���ͣ�
���ǿ��԰������·�������ҩ�裺
- �� 0 �Ź���ҩ�衣
- 0 �Ź���������� 2��0 + 1 >= 1��
- 1 �Ź���������� 1��3 >= 2��
- 2 �Ź���������� 0��3 >= 3��
ʾ�� 2��

���룺tasks = [5,4], workers = [0,0,0], pills = 1, strength = 5
�����1
���ͣ�
���ǿ��԰������·�������ҩ�裺
- �� 0 �Ź���ҩ�衣
- 0 �Ź���������� 0��0 + 5 >= 5��
ʾ�� 3��

���룺tasks = [10,15,30], workers = [0,10,10,10,10], pills = 3, strength = 10
�����2
���ͣ�
���ǿ��԰������·�������ҩ�裺
- �� 0 �ź� 1 �Ź���ҩ�衣
- 0 �Ź���������� 0��0 + 10 >= 10��
- 1 �Ź���������� 1��10 + 10 >= 15��
ʾ�� 4��

���룺tasks = [5,9,8,5,9], workers = [1,6,4,2,6], pills = 1, strength = 5
�����3
���ͣ�
���ǿ��԰������·�������ҩ�裺
- �� 2 �Ź���ҩ�衣
- 1 �Ź���������� 0��6 >= 5��
- 2 �Ź���������� 2��4 + 5 >= 8��
- 4 �Ź���������� 3��6 >= 5��
 */
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class EX4 {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        TreeMap<Integer, Integer> workerMap = new TreeMap<>();
        for (int worker : workers) {
            workerMap.put(worker, workerMap.getOrDefault(worker, 0) + 1);
        }
        int ans = 0;
        int l = 0, r = tasks.length - 1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if (helper(tasks, new TreeMap<>(workerMap), pills, strength, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans + 1;
    }

    private boolean helper(int[] tasks, TreeMap<Integer, Integer> workerMap, int pills, int strength, int mid) {
        for (int i = mid; i >= 0; i--) {
            Map.Entry<Integer, Integer> ceilingEntry = workerMap.ceilingEntry(tasks[i]);
            if (ceilingEntry != null) {
                //��ʹ��ҩ��
                if (ceilingEntry.getValue() > 1) {
                    workerMap.put(ceilingEntry.getKey(), ceilingEntry.getValue() - 1);
                } else {
                    workerMap.remove(ceilingEntry.getKey());
                }
            } else {
                //ʹ��ҩ��
                if (pills == 0) {
                    return false;
                }
                pills--;
                Map.Entry<Integer, Integer> entry = workerMap.ceilingEntry(tasks[i] - strength);
                if (entry != null) {
                    if (entry.getValue() > 1) {
                        workerMap.put(entry.getKey(), entry.getValue() - 1);
                    } else {
                        workerMap.remove(entry.getKey());
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
