package DEC11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX2 {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        ArrayList<Integer> list=new ArrayList<>();
        if(time==0){
            for(int i=0;i<security.length;i++){
                list.add(security[i]);
            }
            return list;
        }
        if(time*2+1>security.length){
            return list;
        }
        else{
            for (int i =time;i<security.length;i++) {

                int[] num=new int[time];
                int[] num1=new int[time];
                for (int j =i-time; j <i ; j++) {
                    num[i-j]=security[j];
                }
                for (int k = 0; k <time ; k++) {
                    if(num[k]<num[k+1]){
                        break;
                    }
                }
                for(int j=i;j<i+time;j++){
                    num1[j-i]=security[j];
                }
                for(int k=0;k>time;k++){
                    if(num[k]>num[k+1]){
                        break;
                    }
                }
            }
            list.add(time);
        }
        return list;
    }
}
