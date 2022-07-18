import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

import static java.util.Objects.hash;

public class HashTable <K,V>{
    private TreeMap<K,V>[] hashtable;
    private int size;
    private int M;
        //生成带参构造函数
    public HashTable(int M){
        this.M=M;
        size=0;
        hashtable=new TreeMap[M];
        for(int i=0;i<M;i++){
            hashtable[i]=new TreeMap<>();

        }
    }
    //生成无产构造函数
    public HashTable(){
        this(10);

    }
    public int getSize(){
        return size;
    }
    //增加操作,如果KEY存在，那么修改，如果KEY不存在，那么新增
    public void add(K key,V value){
        int index=hashkey(key);
        TreeMap<K, V> treeMap = hashtable[index];
        if(treeMap.containsKey(key)){
            treeMap.put(key, value);
        }else{
            treeMap.put(key, value);
            size++;
        }
    }

    private int hashkey(K key) {
        return (key.hashCode()&0x7fffffff)%M;
    }

    //删除操作
    public V remove(K key){
        int index=hashkey(key);
        TreeMap<K, V> treeMap = hashtable[index];
        if(treeMap.containsKey(key)){
            V v = treeMap.remove(key);
            size--;
            return v;
        }
        return null;
    }
    //获取数据
    public V get(K key){
        return hashtable[hashkey(key)].get(key);
    }
}



class Car extends Vehicle
{
    public static void main (String[] args)
    {
        new  Car(). run();
    }
    private final void run()
    {
        System. out. println ("Car");
    }
}
class Vehicle
{
    private final void run()
    {
        System. out. println("Vehicle");
    }
}


public class Solution{
    public int maxEnvelops(int[][] A){
        if(A==null||A.length==0){
            return 0;
        }
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }else{
                    return a[0]-b[0];
                }
            }
        });
        int n=A.length;
        int[] f=new int[n];
         int i,j,res=0;
         for(i=0;i<n;i++){
             f[i]=1;
             for(j=0;j<i;j++){
                 if(A[j][0]<A[i][0]&&A[j][1]<A[i][1]){
                     f[i]=Math.max(f[i],f[i]+1);
                 }
             }
             res=Math.max(res,f[i]);
         }
         return res;
    }
}

public class Solution{
    public int numSquares(int n){
        int[] f=new int[n+1];
        f[0]=0;
        int i,j;
        for(i=1;i<=n;i++){
            f[i]=Integer.MAX_VALUE;
            for(j=1;j*j<=i;j++){
                if(f[i-j*j]+1<f[i]){
                    f[i]=f[i-j*j]+1;
                }
            }
        }
        return  f[n];
    }
}
public class Solution{
    public int minCut(String ss){
        char[] s=ss.toCharArray();
        int n=s.length;
        if(n==0){
            return 0;
        }
        boolean[][] isPalin=new boolean[n][n];
        int i,j,t;
        //初始化数组
        for(i=0;i<n;i++){
            for(j=i;j<n;++j){
                isPalin[i][j]=false;
            }
        }
        for(t=0;t<n;t++){
            //奇数的情况
            i=j=t;
            while(i>=0&&j<n&&s[i]==s[j]){
                isPalin[i][j]=true;
                --i;
                ++j;
            }
            //偶数的情况
            i=t;
            j=t+1;
            while(i>=0&&j<n&&s[i]==s[j]){
                isPalin[i][j]=true;
                --i;
                ++j;
            }
        }
        int[] f=new int[n+1];
        f[0]=0;
        for(i=1;i<=n;i++){
            f[i]=Integer.MAX_VALUE;
            for(j=0;j<i;j++){
                if(isPalin[j][i-1]){
                    f[i]=Math.min(f[j]+1,f[i]);
                }
            }
        }
        return  f[n]-1;
    }
}


public class Solution{
    public int copyBooks(int[] A,int k){
        int n=A.length;
        if(n==0){
            return 0;
        }
        if(k>n){
            k=n;
        }
        int[][] f=new int[k+1][n+1];
        int i,j,z;
        f[0][0]=0;
        for(j=1;j<=n;++j){
            f[0][j]=Integer.MAX_VALUE;
        }
        int sum=0;
        for(z=1;z<=n;z++){
            f[z][0]=0;
            for(i=1;i<=n;i++){
                f[k][i]=Integer.MAX_VALUE;
                sum=0;
                for(j=i;j>=0;j--){
                    f[k][i]=Math.min(f[k][i],Math.max(f[k-1][j],sum));
                    if(j>0){
                        sum+=A[j-1];
                    }
                }
            }
        }
        return f[k][n];
    }
}



class Solution{
    public int countVowelSubstrings(String word) {
        int count=0;
        int len=word.length();
        ArrayList<String> list=new ArrayList<>();
        int[] yy=new int[]{'a','e','i','o','u'};
        for(int i=0;i<len;i++){
            for(int j=i;j<word.length();j++){
                list.add(word.substring(i,j));
            }
        }
        String[] result=new String[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        for(int i=0;i< result.length;i++){
            for(int j=0;j<result[i].length();j++){
                if(result[i].charAt(j)-'a'==0||result[i].charAt(j)-'e'==0||result[i].charAt(j)-'i'==0||
                result[i].charAt(j)-'o'==0||result[i].charAt(j)-'u'==0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}


class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int len=quantities.length;
        int sum=0;
        int count=0;
        for(int i=0;i<len;i++){
            sum+=quantities[i];
        }
        if(sum%n==0){
            count=num/n;
        }
        return count;
    }
}