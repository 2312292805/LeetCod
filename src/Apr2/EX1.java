package Apr2;

import javax.print.DocFlavor;

public class EX1 {
    public static int minBitFlips(int start, int goal) {
        int count = 0;
        String sb1 = Integer.toBinaryString(start);
        StringBuffer sb3 = new StringBuffer(sb1);
        String sb4 = sb3.reverse().toString();
        System.out.println(sb4);
        String sb2 = Integer.toBinaryString(goal);
        StringBuffer sb5 = new StringBuffer(sb2);
        String sb6 = sb5.reverse().toString();
        System.out.println(sb6);
        if (sb4.length() < sb6.length()) {
            StringBuffer sb7 = new StringBuffer(sb4);
            int len = sb6.length() - sb4.length();
            for (int i = 0; i < len; i++) {
                sb7.append(0);
            }
            for (int j = 0; j < sb6.length(); j++) {
                if (sb6.charAt(j) != sb7.charAt(j)) {
                    count++;
                }
            }
        }
        if (sb4.length() == sb6.length()) {
            for (int j = 0; j < sb4.length(); j++) {
                if (sb4.charAt(j) != sb6.charAt(j)) {
                    count++;
                }
            }
        }
        if (sb4.length() > sb6.length()) {
            StringBuffer sb8 = new StringBuffer(sb6);
            int len2 = sb4.length() - sb6.length();
            for (int i = 0; i < len2; i++) {
                sb8.append(0);
            }
            for (int i = 0; i < sb4.length(); i++) {
                if (sb8.charAt(i) != sb4.charAt(i)) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int a=minBitFlips(10,7);
        System.out.println(a);
    }
}
