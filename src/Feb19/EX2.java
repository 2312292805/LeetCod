package Feb19;

public class EX2 {
    public long[] sumOfThree(long num) {
        long[] list=new long[3];
        if(num%3!=0){
            return list;
        }
        if(num%3==0){
            list[0]=num%3-1;
            list[1]=num%3;
            list[2]=num%3+1;
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
