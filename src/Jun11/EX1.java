package Jun11;

public class EX1 {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }

        int count1=0,count2=0,count3=0,count4=0;
        for(int i=1;i<password.length();i++){
            if(password.charAt(i)==password.charAt(i-1)){
                return false;
            }
        }
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)-'a'>=0&&password.charAt(i)-'a'<=26){
                count1++;
                continue;
            }
            if(password.charAt(i)-'A'>=0&&password.charAt(i)-'A'<=26){
                count2++;
                continue;
            }
            if(password.charAt(i)-'0'>=0&&password.charAt(i)-'0'<=9){
                count3++;
                continue;
            }
            if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'
            ||password.charAt(i)=='$'||password.charAt(i)=='%'||password.charAt(i)=='^'||password.charAt(i)=='&'
            ||password.charAt(i)=='*'||password.charAt(i)=='('||password.charAt(i)==')'||password.charAt(i)=='-'||password.charAt(i)=='+'){
                count4++;
                continue;
            }
        }
        if(count1!=0&&count2!=0&&count3!=0&&count4!=0){
            return true;
        }
    }
}
