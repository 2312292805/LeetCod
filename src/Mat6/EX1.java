package Mat6;

import java.util.ArrayList;
import java.util.List;

public class EX1 {
    public List<String> cellsInRange(String s) {
        List<String> list=new ArrayList<>();
        int res=0;
        int len=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==':'){
                res=i;
            }
        }
        String s1=s.substring(0,res);
        String s2=s.substring(res+1,len);
        StringBuffer sb=new StringBuffer();
        char s3=s1.charAt(0);
        char s4=s2.charAt(0);
        int s5=s1.charAt(1);
        int s6=s2.charAt(1);
        for(int i=s5;i<=s6;i++){
            for(char j=s3;j<=s4;j++){
                sb.append(i);
                sb.append(j);
            }
        }
        for(int i=0;i<sb.length();i+=2){
            list.add(sb.substring(i,i+2));
        }
        return list;


    }
}
    public static List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        String[] split = s.split(":");
        int row1 = split[0].charAt(1) - '0';
        int row2 = split[1].charAt(1) - '0';
        int max = Math.max(row1,row2);
        int min = Math.min(row1,row2);
        for (int i = split[0].charAt(0); i <= split[1].charAt(0); i++) {
            for (int j = min; j <= max; j++) {
                list.add((((char)i) + Integer.toString(j)));
            }
        }
        return list;
    }


