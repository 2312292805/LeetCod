package Jun26;

public class EX2 {
    public int countHousePlacements(int n) {
        int count=1;
        int[][] num=new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=1;j<n;j++){
                for(int k=0;k<=n;k++) {
                    if (k == j - 1 || k == j || k == j + 1) {
                        continue;
                    }
                    count++;
                }
            }
        }
        return count%1000000009
    }
}
