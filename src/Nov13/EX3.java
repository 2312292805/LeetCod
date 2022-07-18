package Nov13;
/*
5912. ÿһ����ѯ���������ֵ
����һ����ά�������� items ������ items[i] = [pricei, beautyi] �ֱ��ʾÿһ����Ʒ�� �۸� �� ����ֵ ��

ͬʱ����һ���±�� 0 ��ʼ���������� queries ������ÿ����ѯ queries[j] ����������۸�С�ڵ��� queries[j] ����Ʒ�У���������ֵ �Ƕ��١���������ڷ�����������Ʒ����ô��ѯ�Ľ��Ϊ 0 ��

���㷵��һ�������� queries ��ͬ������ answer������ answer[j]�ǵ� j ����ѯ�Ĵ𰸡�



ʾ�� 1��

���룺items = [[1,2],[3,2],[2,4],[5,6],[3,5]], queries = [1,2,3,4,5,6]
�����[2,4,5,5,6,6]
���ͣ�
- queries[0]=1 ��[1,2] ��Ψһ�۸� <= 1 ����Ʒ�����������ѯ�Ĵ�Ϊ 2 ��
- queries[1]=2 ��������������Ʒ�� [1,2] �� [2,4] ��
  �����е��������ֵΪ 4 ��
- queries[2]=3 �� queries[3]=4 ��������������Ʒ��Ϊ [1,2] ��[3,2] ��[2,4] �� [3,5] ��
  �����е��������ֵΪ 5 ��
- queries[4]=5 �� queries[5]=6 ��������Ʒ������������
  ���ԣ���Ϊ������Ʒ�е��������ֵ��Ϊ 6 ��
ʾ�� 2��

���룺items = [[1,2],[1,2],[1,3],[1,4]], queries = [1]
�����[4]
���ͣ�
ÿ����Ʒ�ļ۸��Ϊ 1 ����������ѡ���������ֵ 4 ��
ע�⣬�����Ʒ��������ͬ�ļ۸������ֵ��
ʾ�� 3��

���룺items = [[10,1000]], queries = [5]
�����[0]
���ͣ�
û����Ʒ�ļ۸�С�ڵ��� 5 ������û����Ʒ����ѡ��
��ˣ���ѯ�Ľ��Ϊ 0 ��

 */
/*import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EX3 {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int len= items.length;
        int len1= queries.length;
        int count=0;
        Arrays.sort(items, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0])
                    return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });

        int[] result=new int[queries.length];
        for(int i=0;i< len;i++){
            for(int j=0;j<len1;j++){
                if(items[i][1]<=queries[j]&&items[i+1][1]>queries[j]){
                    result[i]=items[i][1];
                }
            }
        }
        return result;
    }
}

class Solution {

    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (o, p) -> o[0] - p[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>(Map.of(0, 0));
        int max = 0, result[] = new int[queries.length];
        for (int[] item : items) {
            map.put(item[0], max = Math.max(max, item[1]));
        }
        for (int i = 0; i < queries.length; i++) {
            result[i] = map.floorEntry(queries[i]).getValue();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] result=[[1,2],[3,4],[3,5],[4,8]];
        int[] result1={1,2,3,5};

    }
}
*/