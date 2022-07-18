package Nov17;

import java.util.HashSet;
/*
子字符串 是字符串中的一个连续（非空）的字符序列。

元音子字符串 是 仅 由元音（'a'、'e'、'i'、'o' 和 'u'）组成的一个子字符串，且必须包含 全部五种 元音。

给你一个字符串 word ，统计并返回 word 中 元音子字符串的数目 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/count-vowel-substrings-of-a-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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

