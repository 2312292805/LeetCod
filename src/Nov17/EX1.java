package Nov17;

import java.util.HashSet;
/*
���ַ��� ���ַ����е�һ���������ǿգ����ַ����С�

Ԫ�����ַ��� �� �� ��Ԫ����'a'��'e'��'i'��'o' �� 'u'����ɵ�һ�����ַ������ұ������ ȫ������ Ԫ����

����һ���ַ��� word ��ͳ�Ʋ����� word �� Ԫ�����ַ�������Ŀ ��

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/count-vowel-substrings-of-a-string
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class EX1 {


        public int countVowelSubstrings(String word) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                HashSet<Character> set = new HashSet<>();
                for (int j = i; j < word.length(); j++) {
                    if ("aeiou".indexOf(word.charAt(j)) < 0) {
                        break;
                    }
                    set.add(word.charAt(j));
                    if (set.size() == 5) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

