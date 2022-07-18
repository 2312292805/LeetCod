package Apr17;

import java.util.ArrayList;

public class EX1 {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        int count=0;
        int sum=0;

        ArrayList<List<Integer>> list=new ArrayList<List<Integer>>();
        ArrayList<Integer> list1=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        while(s.length()>k){
            int z=s.length()/k;
            int dif=s.length()-z*k;
            for(int i=0;i<s.length()-dif;i++){
                count=0;
                sum=0;
                while(count<k){
                  sum+=(int)s.charAt(i);
                  count++;
                }
                sb.append(sum);
            }
            for(int i=s.length()-dif;i<s.length();i++){
                sum=0;
                sum+=s.charAt(i);
            }
            sb.append(sum);
            s=sb.toString();
        }
        return s;
    }
}
