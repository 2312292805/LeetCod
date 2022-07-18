package Nov17;
/*
给你一个字符串 word ，返回 word 的所有子字符串中 元音的总数 ，元音是指 'a'、'e'、'i'、'o' 和 'u' 。

子字符串 是字符串中一个连续（非空）的字符序列。

注意：由于对 word 长度的限制比较宽松，答案可能超过有符号 32 位整数的范围。计算时需当心。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/vowels-of-all-substrings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
