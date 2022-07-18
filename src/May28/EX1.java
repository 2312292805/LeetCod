package May28;

public class EX1 {
    public boolean digitCount(String num) {
        int[] nums=new int[10];
        for(int i=0;i<num.length();i++){
            nums[num.charAt(i)-48]++;
        }
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        for(int i=0;i<num.length();i++){
            if(nums[i]!=Integer.valueOf(num.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
