package Mar27;

public class EX3 {
    public long[] kthPalindrome(int[] queries, int intLength) {
        Long[] res=new Long[queries.length];
        int re=0;
        boolean f=true;
        double start=Math.pow((double) 10,(double) intLength);
        for (double i = Math.pow((double) 10,(double) intLength); i <Math.pow((double) 10,(double) intLength+1) ; i++) {
            String s=""+i;
            int left=0;
            int right=s.length()-1;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    f=false;
                    break;
                }
                left++;
                right--;
            }
            if(i-start==queries[(int)(i-start)]&&f){
                res[(int)(i-start)]=(long)i;
            }
            if(i-start==queries[(int)(i-start)]&&f==false){
                res[(int)(i-start)]=(long)-1;
            }
        }
        return res;
    }
}
