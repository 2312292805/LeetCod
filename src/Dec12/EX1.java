package Dec12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class EX1 {
    public int countPoints(String rings) {
        HashMap<Integer,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        ArrayList<Character> list=new ArrayList<>();
        ArrayList<ArrayList<Character>> temp=new ArrayList<>();
        int count=0;
        int[] num=new int[10];
        for(int i=0;i<rings.length();i++){
            {
                for (int j = 0; j < 10; j++) {
                    count=0;
                    if (rings.charAt(i) == j) {
                        list.add(rings.charAt(i - 1));
                        count++;
                    }
                    num[j]=count;
                }
                temp.add(list);
            }
        }


        char[] n=new char[]{'R','G','B'};
        //int[] gang=new int[10];
        for (int i = 0; i <10;i++) {
            if(num[i]>=3){
                for(int j = 0;j<num[i];j++){

                }
            }
        }

    }
}
