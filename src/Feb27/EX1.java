package Feb27;

public class EX1 {
    public int prefixCount(String[] words,String pref){
        int len=pref.length();
        int count=0;
        int len1=words.length;
        for(int i=0;i<len1;i++){
            if(words[i].substring(len)==pref){
                count++;
            }
        }
        return count;
    }
}
