package util;

import java.util.Comparator;

public class CustomComparator implements Comparator<String[]> {

    @Override
    public int compare(String[] o1, String[] o2) {
        int minLen = Math.min(o1.length, o2.length);
        for (int i = 0; i < minLen; i++) {
            int res = compareStrings(o1[i], o2[i]);
            if (res < 0) return -1;
            else if (res > 0) return 1;
        }
        return Integer.compare(o1.length, o2.length);
    }

    public static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public int compareStrings(String s1, String s2) {
        if (isNumber(s1) && isNumber(s2)) {
            return Double.compare(Double.parseDouble(s1), Double.parseDouble(s2));
        } else if (!isNumber(s1) && isNumber(s2)) return 1;
        else if (isNumber(s1) && !isNumber(s2)) return -1;
        else return s1.compareTo(s2);
    }
}