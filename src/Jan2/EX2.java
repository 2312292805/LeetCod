package Jan2;

import java.util.ArrayList;

public class EX2 {
    public int numberOfBeams(String[] bank) {
        /*int len=bank.length;
        int num[]=new int[len];
        int count=0;
        int result=0;
        for(int i=0;i<len;i++){
            count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)!=0){
                    count++;
                }
            }
            if(count!=0){
                num[i]=count;
            }
        }
        for(int i=1;i<num.length;i++){
            if(num[i]==0){
                break;
            }
            else{
                result+=num[i]*num[i-1];
            }

        }
        return result;
    }*/
        int len = bank.length;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int result = 0;
        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                //System.out.println(bank[i].charAt(j));
                if (bank[i].charAt(j) == '1') {
                    count++;
                }
                list.add(count);
            }
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
            }
        }
        for (int i = 1; i < list.size(); i++) {
            result += list.get(i) * list.get(i - 1);
        }
        return result;
    }
}
