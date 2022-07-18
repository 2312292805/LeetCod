package Feb20;

public class EX1 {
    public int countEven(int num) {
        int count1=0;
        int count2=0;
        for (int i = 2; i <num ; i++) {
            count1=0;
            String str=""+i;
            for(int j=0;j<str.length();j++){
                count1+=str.charAt(j);
            }
            if(count1%2==0){
                count2++;
            }
        }
        return count2;
    }
}
