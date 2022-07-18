package May29;

import java.util.ArrayList;
import java.util.Arrays;

public class EX1 {
    public int rearrangeCharacters(String s, String target) {
        int[] num=new int[26];
        for(int i=0;i<s.length();i++){
            num[s.charAt(i)-'a']++;
        }
        int[] nums=new int[26];
        for(int i=0;i<target.length();i++){
            nums[target.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(nums[i]!=0){
                num[i]/=nums[i];
            }
        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            if(num[i]!=0){
                return num[i];
            }
        }
    }
}
