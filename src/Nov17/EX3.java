package Nov17;
/*
����һ������?n?����ʾ��?n?�������̵ꡣ�ܹ���?m?�ֲ�Ʒ��ÿ�ֲ�Ʒ����Ŀ��һ���±�� 0?��ʼ����������?quantities?��ʾ������?quantities[i]?��ʾ��?i?����Ʒ����Ŀ��

����Ҫ�� ������Ʒ?���䵽�����̵꣬��������Щ����

һ���̵� ����?ֻ���� һ����Ʒ ����һ���̵�ӵ�е���Ʒ��Ŀ����Ϊ?����?����
�����ÿ���̵궼�ᱻ����һ����Ŀ����Ʒ������Ϊ 0?��������?x?��ʾ�����̵��з�����Ʒ��Ŀ�����ֵ����ϣ�� x?ԽСԽ�á�Ҳ����˵������ ��С��?����������̵���Ʒ��Ŀ�� ���ֵ?��
���㷵����С�Ŀ��ܵ�?x?��

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/minimized-maximum-of-products-distributed-to-any-store
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class EX3 {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1, right = 100000;
        while (left < right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int quantity : quantities) {
                count += (quantity + mid - 1) / mid;
            }
            if (count > n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
