package May29;

public class EX2 {
    public String discountPrices(String sentence, int discount) {
        double price=0.0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<sentence.length()-1;i++){
            if(sentence.charAt(i)=='$'){
                int k=i;
                StringBuffer sm=new StringBuffer();
                while(sentence.charAt(k)>48&&sentence.charAt(k)<58){
                    sm.append(sentence.charAt(k));
                    k++;
                }
                int res=Integer.valueOf(sm.toString());
                sb.append(res*discount/100);
            }
            sb.append(sentence.charAt(i));
        }
        return sb.toString();
    }
}
