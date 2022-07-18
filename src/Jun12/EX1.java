package Jun12;

public class EX1 {
    public double calculateTax(int[][] brackets, int income) {
        double res=0.0;
        for(int i=0;i< brackets.length;i++){
            if(income>=brackets[i][0]){
                res+=(double) income*brackets[i][1];
            }else{
                res+=(double) (income-brackets[i-1][0])*brackets[i][1];
                break;
            }
        }
        return res;
    }
}
