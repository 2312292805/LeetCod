package Nov14;

import java.util.ArrayList;

public class EX1 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int len=tickets.length;
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i< tickets.length;i++){
            list.add(tickets[i]);
        }
        for(int i=0;i<tickets[k]-1;i++){
            for(int j=0;j<list.size();j++){
                if(tickets[k]==1){
                    count=k;
                    break;
                }
                tickets[i]--;
                count+= list.size();
                for(int z=0;z< tickets.length;z++){
                    if(tickets[z]!=0){
                        list.add(tickets[z]);
                    }
                }
            }
            count+=list.indexOf(k);
        }
        return count;
    }
}
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        int sum=tickets[k]*tickets.length-1;
        for(int i=0;i< tickets.length;i++){
            if(tickets[i]<tickets[k]){
                count+=tickets[k]-tickets[i];
            }
        }
        for(int i=0;i<k;i++){
            if(tickets[i]>=tickets[k]){
                sum++;
            }
        }
        int result=sum-count;
        return result;
    }
}



