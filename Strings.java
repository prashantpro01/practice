import java.util.*;

public class Strings {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }

        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {

            sb.append(str.charAt(i));
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String arg[]) {
        String str1 = "earth";
        String str2 = "heart";

        str1 = str1.toLowerCase();// lower case
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] str1chararray = str1.toCharArray();// string to char array conversion
            char[] str2chararray = str2.toCharArray();
            // sorting
            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);
            // compair
            boolean result = Arrays.equals(str1chararray, str2chararray);
            if (result == true) {
                System.out.println("both are anagram");
            } else {
                System.out.println("not anagram");
            }
        } else {
            System.out.println("both are not anagram string");
        }
    }

    // public static void main(String arg[]) {
    // // String str = "hi, iam prashant";
    // String str = "aabbbbegg";
    // System.out.print(stringCompression(str));
    // }
    // public static void main(String arg[]) {
    // String path = "WNEENESENNN";
    // System.out.println(path.substring(0, 5));
    // // System.out.print(getShortestPath(path));
    // String fruits[] = { "apple", "mango", "banana" };
    // String largest = fruits[0];
    // for (int i = 0; i < fruits.length; i++) {
    // if(largest.compareTo(fruits[i])<0){
    // largest=fruits[i];
    // }

    // }
    // System.out.println(largest);

    // StringBuilder sb = new StringBuilder("");
    // for (char ch = 'a'; ch <= 'z'; ch++) {
    // sb.append(ch);
    // }
    // System.out.println(sb.length());
    // }

}
