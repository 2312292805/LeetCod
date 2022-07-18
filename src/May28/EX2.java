package May28;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class EX2 {
    public String largestWordCount(String[] messages, String[] senders) {
        int[] num=new int[messages.length];
        int k=1;
        for(int i=0;i<messages.length;i++){
            k=1;
            for(int j=0;j<messages[i].length();j++){
                if(messages[i].charAt(j)==' '){
                    k++;
                }
            }
            num[i]=k;
        }
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0;i< messages.length;i++){
            if(map.containsKey(senders[i])){
                if()
            }
            map.put(senders[i],num[i]);
        }

    }
}
