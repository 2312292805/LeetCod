package Nov13;
/*
5910. ��������ַ����Ƿ񼸺����
��������ַ��� word1 �� word2 �д� 'a' �� 'z' ÿһ����ĸ����Ƶ��֮� ������ 3 ����ô���ǳ��������ַ��� word1 �� word2 ������� ��

�����������ȶ�Ϊ n ���ַ��� word1 �� word2 ����� word1 �� word2 ������� �����㷵�� true �����򷵻� false ��

һ����ĸ x �ĳ��� Ƶ�� ָ���������ַ����г��ֵĴ�����



ʾ�� 1��

���룺word1 = "aaaa", word2 = "bccb"
�����false
���ͣ��ַ��� "aaaa" ���� 4 �� 'a' ������ "bccb" ���� 0 �� 'a' ��
����֮��Ϊ 4 ���������� 3 ��
ʾ�� 2��

���룺word1 = "abcdeef", word2 = "abaaacc"
�����true
���ͣ�word1 �� word2 ��ÿ����ĸ����Ƶ��֮������Ϊ 3 ��
- 'a' �� word1 �г����� 1 �Σ��� word2 �г����� 4 �Σ���Ϊ 3 ��
- 'b' �� word1 �г����� 1 �Σ��� word2 �г����� 1 �Σ���Ϊ 0 ��
- 'c' �� word1 �г����� 1 �Σ��� word2 �г����� 2 �Σ���Ϊ 1 ��
- 'd' �� word1 �г����� 1 �Σ��� word2 �г����� 0 �Σ���Ϊ 1 ��
- 'e' �� word1 �г����� 2 �Σ��� word2 �г����� 0 �Σ���Ϊ 2 ��
- 'f' �� word1 �г����� 1 �Σ��� word2 �г����� 0 �Σ���Ϊ 1 ��
ʾ�� 3��

���룺word1 = "cccddabba", word2 = "babababab"
�����true
���ͣ�word1 �� word2 ��ÿ����ĸ����Ƶ��֮������Ϊ 3 ��
- 'a' �� word1 �г����� 2 �Σ��� word2 �г����� 4 �Σ���Ϊ 2 ��
- 'b' �� word1 �г����� 2 �Σ��� word2 �г����� 5 �Σ���Ϊ 3 ��
- 'c' �� word1 �г����� 3 �Σ��� word2 �г����� 0 �Σ���Ϊ 3 ��
- 'd' �� word1 �г����� 2 �Σ��� word2 �г����� 0 �Σ���Ϊ 2 ��
 */
class EX1 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int count=0;
        int[] num=new int[26];
        int[] num1=new int[26];
        for(int i=0;i<word1.length();i++){
            num[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++)
        {
            num1[word2.charAt(i)-'a']++;
        }
        //int len=Math.max(num1.length,num.length);
        for(int i=0;i<26;i++){
          count=Math.abs(num[i]-num1[i]);
        }
        return count>3?true:false;
    }
}
