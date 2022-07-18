package Jul10;

import java.util.Arrays;

public class EX1 {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int count=0;
             if(amount[0]!=0){
                 count+=amount[0];
             }
             else if(amount[1]!=0){
                 count+=amount[1]-amount[0];
             }
             else {
                 count+=amount[2]+amount[1];
             }
        return count;
    }
}
