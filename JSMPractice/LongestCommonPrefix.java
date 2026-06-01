import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input={"flowers","flow","flight"};
        String result = Arrays.stream(input)
                .reduce((w1, w2) -> commonPrefix(w1, w2))
                .orElse("");

        System.out.println(result);

    }

    private static String commonPrefix(String a, String b) {
        int minLen=Math.min(a.length(),b.length());
        int i=0;
        while(i<minLen && a.charAt(i)==b.charAt(i)){
            i++;
        }
        return a.substring(0,i);
    }


}
