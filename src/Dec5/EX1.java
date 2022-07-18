package Dec5;

import java.util.*;

public class EX1 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,1,3,0};
        findEvenNumbers(arr);

    }
    public static int[] findEvenNumbers(int[] digits) {
        StringBuilder sb=new StringBuilder();
        ArrayList<Integer> list=new ArrayList<>();
       //ArrayList<Integer> temp=new ArrayList<>();
        int len=digits.length;
        int count1=0;
        int count2=0;
        String result;
        while(count1<=len-1){
            sb.delete(0,2);
            for(int i=0;i<len;i++){
                if(digits[i]==0){
                    continue;
                }
                count1=i;
                sb.append(digits[i]);
            }
            for(int j=0;j<len&&j!=count1;j++){
                sb.append(digits[j]);
                count2=j;
            }
            for(int k=0;k<len&&k!=count1&&k!=count2;k++){
                if(digits[k]%2==0){
                    sb.append(digits[k]);
                }
            }
            result=sb.toString();
            System.out.println(result);
            list.add(Integer.getInteger(result));
        }
        int[] num=new int[list.size()];
        for(int i=0;i<num.length;i++){
            num[i]=list.get(i);
        }
        return num;
    }
}
