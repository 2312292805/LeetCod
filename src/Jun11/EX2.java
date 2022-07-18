package Jun11;

public class EX2 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res=new int[spells.length];
        long x=0L;
        int count=0;
        for(int i=0;i<spells.length;i++){
            long[] num=new long[potions.length];
            count=0;
            for(int j=0;j<potions.length;j++){
                num[j]=(long)(spells[i]*potions[j]);
                if(num[j]>=success){
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
}
