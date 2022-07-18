package Apr3;

import java.util.ArrayList;
import java.util.List;

public class EX2 {
    public List<List<Integer>> findWinners(int[][] matches) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int count=0;
        int n= matches.length;
        int[] winders=new int[n];
        int[] loser=new int[n];
        for(int i=0;i<n;i++){
            winders[i]=matches[i][0];
        }
        for(int i=0;i<n;i++){
            loser[i]=matches[i][1];
        }
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(matches[i][0]==loser[j]){
                    count++;
                    if(count>1){
                        break;
                    }
                }
            }
            if(count==0){
                list1.add(matches[0][i]);
            }
            if(count==1){
                list2.add(matches[0][i]);
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
}
