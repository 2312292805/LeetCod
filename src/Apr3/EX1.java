package Apr3;

public class EX1 {
    public int convertTime(String current, String correct) {
        String current1=current.substring(0,2);
        String current2=current.substring(3,5);
        int current3=Integer.parseInt(current1);
        int current4=Integer.parseInt(current2);
        int current5=current3*60;
        int current6=current4+current5;
        String correct1=correct.substring(0,2);
        String correct2=correct.substring(3,5);
        int correct3=Integer.parseInt(correct1);
        int correct4=Integer.parseInt(correct2);
        int correct5=correct3*60;
        int correct6=correct4+correct5;
        int[] n=new int[]{60,15,5,1};
        int count=0;
        while(current6<correct6-60){
            if(current6+n[0]>correct6) {
                break;
            }
            current6=current6+n[0];
            count++;
        }
        while(current6<correct6-15){
            if(current6+n[1]>correct6) {
                break;
            }
            current6=current6+n[1];
            count++;
        }
        while (current6<correct6-5){
            if(current6+n[2]>correct6) {
                break;
            }
            current6=current6+n[2];
            count++;
        }
        count=count+(correct6-current6);
        return count;
    }
}
