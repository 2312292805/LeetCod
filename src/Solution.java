/*import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//class Solution {
    /*public int countValidWords(String sentence) {
        int count=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '&&sentence.charAt(i+1)!=' '){
                count++;
            }
            if(sentence.charAt(i)>'0'&&sentence.charAt(i)<'9'){
                i++;
                count=count-1;
            }
            while((sentence.charAt(i)=='!'||sentence.charAt(i)=='.'
            ||sentence.charAt(i)==',')&&sentence.charAt(i+1)==' '){
                count=count-1;
            }
        }
    return count;
    }

     */
class Solution {
    public int nextBeautifulNumber(int n) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        String num = "" + n;
        Arrays.sort
        for (int i = n; i < 1000000; i++) {
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(i) == num.charAt(j)) {
                    count++;
                }
            }
        }

        //��ѡ���洢��A[]�ڲ�����Ҫƴ�յĽ��ΪK
        public int[] coidChange ( int[] A, int K){
            //�������0��n��ʱ����ô���ٵĿռ���Ҫ��n+1���������0��n-1��ʱ����ô���ٵĿռ���n��
            int[] f = new int[K + 1];
            int n = A.length;//ȷ�������Ԫ�ظ���
            //�趨��ʼ����
            f[0] = 0;
            int i, j;//ȷ����������ƴ�յĶ������ʼԪ��
            for (i = 0; i <= m; i++) {
                f[i] = Integer.MAX_VALUE;
                //f[i]=min{f[i-a[0]+1,~~~,f[i-A(n-1)+!]
                for (j = 0; j < n; j++) {
                    if (i >= A[j] && f[i - A[j]] != Integer.MAX_VALUE) {
                        f[i] = Math.max(f[i - A[j]] + 1, f[i]);
                    }
                }
            }
            if (f[M] == Integer.MAX_VALUE) {
                f[M] = -1;
            }
            return f[M];

        }

    }}

class Soulution{
    public int uniqueStack(int[][] A){
        int m=A.length;
        if(m==0){
            return 0;

        }
        int n=A[0].length;
        if(n==0){
            return 0;

        }
        int[][] f=new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(A[0][0]==1){

                }
            }
        }
    }
}


public class solution {
    public int minCount(int[][] costs) {
        int n = costs.length;
        if (n == 0) {
            return 0;
        }//n+1  f[0].....f[n]
        int[][] f = new int[n + 1][3];
        int i, j, k, res;
        //init
        f[0][0] = f[0][1] = f[0][2] = 0;
        for (i = 0; i < n; i++) {
            //j is the color of house i-1
            for (j = 0; j < 3; j++) {
                f[i][j] = Integer.MAX_VALUE;
                //k is the color of the house of i-2
                for (k = 0; k < 3; k++) {
                    if (j == k) {
                        continue;
                    }
                    if (f[i - 1][k] + costs[i - 1][j] < f[i][j]) {
                        f[i][j] = f[i - 1][k] + costs[i - 1][j];
                    }
                }
            }
        }
        res = f[n][0];
        if (f[n][1] < res) {
            res = f[n][1];

        }
        if (f[n][2] < res) {
            res = f[n][2];
        }
        return res;
    }
}
class solution{
    int result=0;
    void calc(int[] A,int n){
        int[] f=new int[2];
        int i;
        int old,now=0;
        for(i=0;i<n;i++){
            old=now;
            now=1-now;
            //��һ�����
            f[now]=1;
            //�ڶ������
            if(i>0&&A[old]<A[now]){
                f[now]=f[old]+1;
            }
            if(f[now]>result){
                result=f[now];
            }
        }
    }
    public int longestingContinout(int[] A){
        int n=A.length;
        if(n==0){
            return 0;
        }
        calc(A,n);
        //inverse A
        int i,j,t;
        i=0;j=n-1;
        while(i<j){
            t=A[i];
            A[i]=A[j];
            A[j]=t;
            ++i;
            --j;
        }
        calc(A,n);
        return result;
    }
}
public class Solution{
    public int minPathSum(int[][] A){
        if(A==null||A.length==0||A[0].length==0){
            return 0;
        }
        int m=A.length;
        int n=A[0].length;
        int[][] f=new int [2][n];
        int old=1,now=0;//old:i-1;now:i
        int i,j,t1,t2;
        for(i=0;i<m;i++){
            old=now;
            now=1-now;
            //ʵ�ֹ�������
            for(j=0;j<n;j++){
                if(i==0&&j==0){
                    f[now][j]=A[i][j];
                    continue;
                }
                f[now][j]=A[i][j];
                if(i>0){
                    t1=f[old][j];
                }else{
                    t1=Integer.MAX_VALUE;
                }
                if(j>0){
                    t2=f[now][j-1];
                }else{
                    t2=Integer.MAX_VALUE;
                }
                if(t1<t2){
                    f[now][j]+=t1;
                }else{
                    f[now][j]+=t2;
                }
            }
        }
        return f[now][n-1];
    }
}
public class Solution{
    public int maxKilledEnemies(char[][] A){
        if(A==null||A.length==0||A[0].length==0){
            return 0;
        }
        int m=A.length;
        int n=A[0].length;
        int[][] f=new int[m][n];
        int[][] res=new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                //�ж��ٵ����ܹ���һ��ը����ʵ
                res[i][j]=0;
            }
        }
        //���ϵķ���
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(A[i][j]=='W'){
                    f[i][j]=0;
                }else{
                    f[i][j]=0;
                    if(A[i][j]=='E'){
                        f[i][j]=1;
                    }
                    if(i>0){
                        f[i][j]+=f[i-1][j];
                    }
                }
                res[i][j]+=f[i][j];
            }
        }

        //���µķ���
        for(i=m-1;i>0;i--){
            for(j=n-1;j>0;j--){
                if(A[i][j]=='W'){
                    f[i][j]=0;
                }else{
                    f[i][j]=0;
                    if(A[i][j]=='E'){
                        f[i][j]=1;
                    }
                    if(i+1<m){
                        f[i][j]+=f[i+1][j];
                    }
                }
                res[i][j]+=f[i][j];
            }
        }

        //����ķ���
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(A[i][j]=='W'){
                    f[i][j]=0;
                }else{
                    f[i][j]=0;
                    if(A[i][j]=='E'){
                        f[i][j]=1;
                    }
                    if(j-1>0){
                        f[i][j]+=f[i][j-1];
                    }
                }
                res[i][j]+=f[i][j];
            }
        }

        //���ҷ���
        for(i=0;i<m;i++){
            for(j=n-1;j>0;j--){
                if(A[i][j]=='W'){
                    f[i][j]=0;
                }else{
                    f[i][j]=0;
                    if(A[i][j]=='E'){
                        f[i][j]=1;
                    }
                    if(i>0){
                        f[i][j]+=f[i][j+1];
                    }
                }
                res[i][j]+=f[i][j];
            }
        }

        int result=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(A[i][j]=='0'){
                    if(res[i][j]>result){
                        result=res[i][j];
                    }
                }
            }
        }
        return  result;
    }
}
public class Solution{
    public int[] countBits(int num){
        int[] f=new int[num+1];
        f[0]=0;
        int i=1;
        for(i=1;i<=num;i++){
            f[i]=f[i>>1]+(i%2);
        }
        return f;
    }
}
class Solution{
    public int maxProfit(int[] A){
        int n=A.lenghth;
        int res=0;
        for(int i=0;i<A.length-1;++i){
            if(A[i+1 ]-A[i]>0){
                res+=A[i+1]-A[i];
            }
        }
        return res;
    }
}

class Solution{
    public int maxProfit(int K,int[] A){
        int n=A.length;
        if(n==0){
            return 0;
        }
        int i,j,k;

        if(K>n){
            int result=0;
            for(i=0;i<n-1;i++){
                result+=Math.max(A[i+1]-A[i],0);
            }
            return result;
        }
        int[][] f=new int[n+1][2*K+1+1];


        //��ʼ������
        f[0][1]=0;
        for(k=2;k<=2*K+1;++k){
            f[0][k]=Integer.MIN_VALUE;
        }
        f[0][2]=f[0][3]=f[0][4]=f[0][5]=Integer.MIN_VALUE;

        for(i=1;i<=n;i++){
            //1,3,5
            for(j=1;j<=2*K+1;j+=2){
                //max{f[i-1][j],f[i-1][j-1]+p[i-1]-p[i-2]
                f[i][j]=f[i-1][j];
                if(j>1&&i>1&&f[i-1][j-1]!=Integer.MIN_VALUE){
                    f[i][j]=Math.max(f[i][j],f[i-1][j-1]+A[i-1]-A[i-2]);
                }
            }
            for(j=2;j<=2*K+1;j+=2){
                f[i][j]=f[i-1][j-1];
                if(i>1&&f[i-1][j]!=Integer.MIN_VALUE){
                    f[i][j]=Math.max(f[i][j],f[i-1][j]+A[i-1]-A[i-2]);
                }
                if(j>2&&i>1&&f[i-1][j-2]!=Integer.MIN_VALUE){
                    f[i][j]=Math.max(f[i][j],f[i-1][j-2]+A[i-1]-A[i-2]);
                }
            }
        }
        int res=Integer.MIN_VALUE;
        for( i=1;i<=2*K+1;i+=2){
            res=Math.max(res,f[n][i]);
        }
        return res;
    }
}

public class Solution{
    public int longestIncreasingSubsequence(int[] A){
        int n=A.length;
        if(n==0){
            return 0;
        }
        int[] f=new int[n];
        int i,j;
        int res=0;
        for(j=0;j<n;j++){
            //��һ�����
            f[j]=1;
            //�ڶ������
            for(i=0;i<j;i++){
                if(A[i]<A[j]&&f[i]+1>f[j]){
                    f[j]=f[i]+1;
                }
            }
            res=Math.max(res,f[j]);
        }
        return  res;
    }
}


import java.util.ArrayList;
public class HashMap{
    static class HashNode<String,Integer>{
        String key;
        Integer value;
        HashNode<String,Integer> next;
        public HashNode(String key,Integer value){
            this.key=key;
            this.value=value;
        }
    }
    private ArrayList<HashNode<String,Integer>> bucketArray;
    private int numBuckets;
    private int size;
    public HashMap(){
        bucketArray=new ArrayList<>();
        numBuckets=10;
        size=0;
        for(int i=0;i<numBuckets;i++){
            bucketArray.add(null);
        }
    }
    private int getBucketIndex(String key){
        int hashCode=key.hashCode();
        int index=hashCode%numBuckets;
        return index;
    }
}


public class Solution{
    public int backPackV(int[] A,int T){
        int i,j;
        int n=A.length;
        if(n==0){
            return 0;
        }
        int[] f=new int[T+1];
        f[0]=1;
        for(i=1;i<=T;i++){
            f[i]=0;
        }
        for(i=1;i<=n;i++){
            for(j=T;j>=0;j--){
                if(j>=A[i-1]){
                    f[j]+=f[j-A[i-1]];
                }
            }
        }
        return f[T];
    }
}


public class Solution{
    public int backPackVI(int[] A,int T){
        int[] f=new int[T+1];
        f[0]=1;
        int i,j;
        for(i=1;i<=T;i++){
            for(j=0;j<A.length;j++){
                if(i>=A[j]){
                    f[i]+=f[i-A[j]];
                }
            }
        }
        return f[T];
    }
}

public class Solution{
    public int backPackII(int m,int[] A,int V[]){
        int n=A.length;
        if(n==0){
            return 0;

        }
        int[] f=new int[m+1];
        int i,w;
        f[0]=0;
        for(i=1;i<=m;i++){
            f[i]=-1;
        }
        for(i=1;i<=n;i++){
            for(w=0;w<=m;w++){
                if(w>=A[i-1]&&f[w-A[i-1]]!=-1){
                    f[w]=Math.max(f[w],f[w-A[i-1]]+V[i-1]);

                }
            }
        }
        int res=0;
        for(i=0;i<=m;i++){
            if(f[i]!=-1){
                res=Math.max(res,f[i]);
            }
        }
        return res;
    }
}

public class EqualsMethod
{
    public static void main(String[] args)
    {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.print(n1 == n2);
        System.out.print(",");
        System.out.println(n1 != n2);
    }
}

public class Solution{
    int[][] f=null;
    char[] s=null;
    public void Compute(int i,int j){
        if(f[i][j]!=-1){
            return;
        }
        //�ݹ����ֹ������Ҳ�ǵ��Ƶ���ʼ����
        if(i==j){
            f[i][j]=1;
            return;
        }
        if(i+1==j){
            f[i][j]=(s[i]==s[j])?2:1;
            return ;
        }
        Compute(i,j-1);
        Compute(i+1,j);
        Compute(i+1,j-1);
        f[i][j]=Math.max(f[i][j-1],f[i+1][j]);
        if(s[i]==s[j]){
            f[i][j]=Math.max(f[i][j],f[i+1][j-1]+2);
        }
    }
    public int longestPalindromeSubseq(String ss) {
        char[] s = ss.toCharArray();
        int n = s.length;
        if (n == 0) {
            return 0;
        }
        f = new int[n][n];
        int i, j;
        /*//����Ϊ1
        for (i = 0; i < n; i++) {
            f[i][i] = 1;
        }
        //����Ϊ2
        for (i = 0; i < n - 1; i++) {
            f[i][i + 1] = (s[i] == s[i + 1]) ? 2 : 1;
        }*/
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                f[i][j]=-1;
            }
        }
        Compute(0,n-1);
        int len;
        for (len = 3; len <= n; len++) {
            //����Ϊlen
            for(i=0;i<=n-len;i++){
                j=i+len-1;
                f[i][j]=Math.max(f[i][j-1],f[i+1][j]);
                if(s[i]==s[j]){
                    f[i][j]=Math.max(f[i][j],f[i+1][j-1]+2);
                }
            }
        }
        return f[0][n-1];
    }
}

public class Solution{
    public boolean firstWillWin(int[] A){
        int n=A.length;
        if(n==0){
            return true;
        }
        int[][] f=new int[n][n];
        int i,j,len;
        for(i=0;i<n;i++){
            f[i][i]=A[i-1];
        }
        for(len=2;len<=n;len++){
            for(i=0;i<=n-len;i++){
                j=i+len-1;
                f[i][j]=Math.max(A[i]-f[i+1][j],A[j]-f[i][j-1]);

            }
        }
        return f[0][n-1]>=0;
    }
}

public class Solution{
    public int longestCommonSubsequence(String AA,String BB){
        char[] A=AA.toCharArray();
        char[] B=BB.toCharArray();
        int m=A.length;
        int n=B.length;
        int[][] f=new int[m+1][n+1];
        int i,j;
        for(i=0;i<=m;i++){
            for(j=0;j<=n;j++){
                //��ʼ������
                if(i==0||j==0){
                    f[i][j]=0;
                    continue;
                }
                //��ͨ���
                f[i][j]=Math.max(f[i-1][j],f[i][j-1]);
                if(A[i-1]==B[j-1]){
                    f[i][j]=Math.max(f[i][j],f[i-1][j-1]+1);
                }
            }
        }
        return f[m][n];
    }
}



public class Solution{
    public boolean isInterleave(String ss1,String ss2,String ss3){
        char[] s1=ss1.toCharArray();
        char[] s2=ss2.toCharArray();
        char[] s3=ss3.toCharArray();

        int m=s1.length;
        int n=s2.length;
        if(s3.length!=m+n){
            return false;
        }
        boolean[][] f=new boolean[m+1][n+1];
        int i,j;
        for(i=0;i<=m;i++){
            for(j=0;j<=n;j++){

                if(i==0&&j==0){
                    f[i][j]=true;
                    continue;
                }
                f[i][j]=false;
                if(i>0&&s3[i+j-1]==s1[i-1]){
                    f[i][j]|=f[i-1][j];
                }
                if(j>0&&s3[i+j-1]==s2[j-1]){
                    f[i][j]=f[i][j-1];
                }
            }
        }
        return f[m][n];
    }
}

public class Solution{
    public int minDistance(String ss1,String ss2){
        char[] s1=ss1.length();
        char[] s2=ss2.length();
        int m=s1.length;
        int n=s2.length;

        int i,j;
        int[][] f=new int[m+1][n+1];
        for(i=0;i<=m;i++){
            for(j=0;j<=n;j++){
                if(i==0){
                    f[i][j]=j;
                    continue;
                }
                if(j==0){
                    f[i][j]=i;
                    continue;
                }
                f[i][j]=Math.min(f[i-1][j]+1,f[i][j-1]+1);
                f[i][j]=Math.min(f[i][j],f[i-1][j-1]+1);
                //���ʱ
                if(s1[i-1]==s2[j-1]){
                    f[i][j]=Math.min(f[i][j],f[i-1][j-1]);
                }
            }
        }
        return f[m][n];
    }
}


public class Solution{
    public int numDistinct(String ss1,String ss2){
        char[] s1=ss1.toCharArray();
        char[] s2=ss2.toCharArray();
        int m=s1.length;
        int n=s2.length;

        int[][] f=new int[m+1][n+1];
        int i,j;
        for(i=0;i<=m;i++){
            for(j=0;j<=n;j++){
                if(j==0){
                    f[i][j]=1;
                    continue;
                }
                if(i==0){
                    f[i][j]=0;
                    continue;
                }
                f[i][j]=f[i-1][j];
                if(s1[i-1]==s2[j-1]){
                    f[i][j]=f[i-1][j-1];
                }
            }
        }
        return f[m][n];
    }
}

class Solution {
    public boolean isMatch(String ss1, String ss2) {
        char[] s1 = ss1.toCharArray();
        char[] s2 = ss2.toCharArray();
        int m = s1.length;
        int n = s2.length;
        boolean[][] f = new boolean[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    f[i][j] = true;
                    continue;
                }
                if (j == 0) {
                    f[i][j] = false;
                    continue;
                }
                f[i][j] = false;
                if (s2[j - 1] != '*') {
                    if (i > 0 && (s2[j - 1] == '.' || A[i - 1] == B[j - 1])) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                } else {
                    if (j - 2 >= 0) {
                        f[i][j] |= f[i][j - 2];
                    }
                    if (i >= 1 && j >= 2) {
                        f[i][j] |= f[i - 1][j] && (s2[j - 2] == '.' || s2[j - 2 = s1[i - 1]]);

                    }
                }
            }

        }
        return f[m][n];
    }
}

public class Solution{
    public boolean isMatch(String ss1,String ss2){
        char[] s1=ss1.length();
        char[] s2=ss2.length();
        int m=s1.length;
        int n=s2.length;

        boolean[][] f=new boolean[m+1][n+1];
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i==0&&j==0){
                    f[i][j]=true;
                    continue;
                }
                //i>0
                if(j==0){
                    f[i][j]=false;
                    continue;
                }
                f[i][j]=false;
                if(s2[j-1]!='*'){
                    if(i>=0&&(s2[j-1]=='?'||s2[j-1]==s1[i-1])){
                        f[i][j]|=f[i-1][j-1];
                    }
                }
                else{
                    f[i][j]=f[i][j-1];
                    if(i>0){
                        f[i][j]|=f[i-1][j];
                    }
                }

            }
        }
        return f[m][n];
    }
}

*/