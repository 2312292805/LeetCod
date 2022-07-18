package Feb19;

import java.util.*;

public class EX3 {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list1=new ArrayList<>();
        if(finalSum%2!=0){
            return list1;
        }

        long end=finalSum/2;
        long sum=4;
        list1.add(sum);
        long con=finalSum/2;
        int sum1=0;
        while(con>=sum1){
            sum1++;
        }
        for(long i=3;i<con;i++){
            sum+=i*2;
            list1.add(i*2);
            if(sum>=finalSum){
                break;
            }
        }
        if(sum>finalSum){
            long count=(sum-finalSum)/2;
            for(long i=0;i<count;i++){
                long count1=list1.get((int) i);
                list1.remove(i);
                count1=count1-2;
                list1.add(count1);
            }
        }
        return list1;
    }
}
