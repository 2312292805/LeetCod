import java.util.ArrayList;

public class Solution1 {
    public int smallestEqual(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]%10==i){
                return i;

            }break;
        }
        return -1;
    }
}
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode val=head;
        ListNode next=head.next;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i = 0; head.length() > i; i++){
            if((head>head.val&&head<head.next)||(head.val<head&&head.next<head)){

            }
        }
    }
}

public class Solution{
    public int minCostII(int[][] A){
        if(A==null||A.length==0){
            return 0;
        }
        int n=A.length;
        int K=A[0].length;
        int[][] f=new int[n+1][K];
        int min1;int min2;
        int j1 = 0,j2=0;//最小值以及次小值对应的坐标
        int i,j,k;
        for(j=0;j<K;j++){
            f[0][j]=0;
        }
        for(i=1;i<=n;i++){
            //先确定min1,min2的数值
            min1=min2=Integer.MAX_VALUE;
            //min1=f[i-1][j1]
            for(j=0;j<K;j++){
                 if(f[i-1][j]<min1){
                     min2=min1;
                     j2=j1;
                     min1=f[i-1][j];
                     j1=j;
                     //min2=f[i-1][j2]
                 }else{
                     if(f[i-1][j]<min2){
                         min2=f[i-1][j];
                         j2=j;
                     }
                 }
             }
            for(j=0;j<K;j++){
                if(j!=j1){
                    f[i][j]=f[i-1][j1]+A[i-1][j];
                }else{
                    //j==j1;
                    f[i][j]=f[i-1][j2]+A[i-1][j];
                }
            }
        }
        int res =Integer.MAX_VALUE;
        for(j=0;j<K;j++){
            res=Math.min(res,f[n][j]);
        }
        return res;
    }
}
public class Solution{
    public long houseRobber(int[] A){
        int n=A.length;
        if(n==0){
            return 0;
        }
        long[] f=new long[n+1];
        f[0]=0;
        f[1]=A[0];
        for(int i=2;i<=n;i++){
            f[i]=Math.min(f[i-1],f[i-2]+A[i-1]);

        }
        return f[n];
    }
}


public class Solution{
    public boolean firstWillWin(int n){
        if(n==0){
            return false;
        }
        if(n<=2){
            return true;
        }
        boolean[] f=new boolean[n+1];
        f[0]=false;
        f[1]=f[2]=true;
        int i;
        for(i=3;i<=n;i++){
            f[i]=(f[i-1]==false)||(f[i-2]==false);
        }
        return f[n];
    }
}


public class Solution{
    public int backPack(int m,int[] A){
        int n=A.length;
        if(n==0){
            return 0;
        }
        boolean[][] f=new boolean[n+1][m+1];
        int i,j;
        f[0][0]=true;
        for(j=1;j<=m;j++){
            f[0][j]=false;
        }
        for(i=i=1;i<=n;i++){
            for(j=0;j<=m;j++){
                f[i][j]=f[i-1][j];
                if(j>=A[i-1]){
                    f[i][j]=f[i][j]||f[i-1][j-A[i-1]];
                }
            }
        }
        for(i=m;i>=0;i--){
            if(f[n][i]){
                return i;
            }
        }
        return 0;
    }
}