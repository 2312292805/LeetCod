package Apr16;

public class EX2 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int count=0;
        int num=total;
        int z=Math.min(cost1,cost2);
        if(total<cost1&&total<cost2){
            return 1;
        }
        while(num>=0){
            num-=cost1;
            count++;
        }
        num=total;
        while(num>=0){
            num-=cost2;
            count++;
        }
        num=total;
        for(int i=0;i<total;i++){
            for(int j=0;j<total;j++){
                if(i*cost1+j*cost2<=total){
                    count++;
                }
            }
        }
        return count;
    }
}
