package May1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EX1 {
    public String removeDigit(String number, char digit) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<number.length();i++){
            StringBuffer sb=new StringBuffer(number);
            if(number.charAt(i)==digit){
                sb.deleteCharAt(i);
                list.add(sb.toString());
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}
