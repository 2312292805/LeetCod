package Feb27;

import java.util.Arrays;

public class EX3 {
    public static long minimumTime(int[] time, int totalTrips) {
        long Counttime=1;
        long count=0;
        Arrays.sort(time);
        while(count<totalTrips){
            for(int i=0;i<time.length;i++){
                if(Counttime<=time[i]){
                    count+=(Counttime/time[i]);                    if(count>=totalTrips){
                        break;
                    }
                }
                else{

                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,7,1,1};
        long res=EX3.minimumTime(arr,5);
    }
}
