package Nov17;
/*
����һ���ַ��� word ������ word ���������ַ����� Ԫ�������� ��Ԫ����ָ 'a'��'e'��'i'��'o' �� 'u' ��

���ַ��� ���ַ�����һ���������ǿգ����ַ����С�

ע�⣺���ڶ� word ���ȵ����ƱȽϿ��ɣ��𰸿��ܳ����з��� 32 λ�����ķ�Χ������ʱ�赱�ġ�

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/vowels-of-all-substrings
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class EX2 {
    public long countVowels(String word) {
        long count = 0;
        for (int i = 0; i < word.length(); i++) {
            if ("aeiou".indexOf(word.charAt(i)) >= 0) {
                count += (i + 1L) * (word.length() - i);
            }
        }
        return count;
    }
}
