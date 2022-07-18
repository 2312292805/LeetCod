package Feb27;

public class EX2 {
    public int minSteps(String s, String t) {
        int[] num=new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            num[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            num[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            count+=Math.abs(num[i]);
        }
        return count;
    }
}
