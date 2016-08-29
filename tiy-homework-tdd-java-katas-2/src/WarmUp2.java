/**
 * Created by davehochstrasser on 8/28/16.
 */
public class WarmUp2 {

    //String Times: Given a string and a non-negative int n, return a larger string that is
    //n copies of the original string.
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    //Count XX: Count the number of "xx" in the given string. We'll say that
    //overlapping is allowed, so "xxx" contains 2 "xx".
    public static int countXX(String str){
        int count = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")) count++;
        }return count;

    }

    //DoubleX: Given a string, return true if the first instance of "x" in the
    //string is immediately followed by another "x".
    public static boolean doubleX(String str){
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i+1 >= str.length()) return false;
        String x = str.substring(i);
        return x.startsWith("xx");

    }

    //String Bits: Given a string, return a new string made of every other
    //char starting with the first, so "Hello" yields "Hlo".
    public static String stringBits(String str) {
        String result = "";
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i+1);
        }
        return result;
    }

    //StringSpolsion: Given a non-empty string like "Code" return a string like "CCoCodCode".
    public static String stringSplosion(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }

    //Given a string, return the count of the number of times that a substring length 2 appears
    //in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
    //(we won't count the end substring).
    public static int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length()-2);
        int count = 0;
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }

    //Array Count 9: Given an array of ints, return the number of 9's in the array.
    public static int arrayCount9(int[] nines) {
        int count = 0;
        for (int i=0; i<nines.length; i++) {
            if (nines[i] == 9) {
                count++;
            }
        }
        return count;
    }

    //Array Front 9: Given an array of ints, return true if one of the first 4 elements in the array
    //is a 9. The array length may be less than 4.
    public static boolean arrayFront9(int[] num) {
        int end = num.length;
        if (end > 4) end = 4;
        for (int i=0; i<end; i++) {
            if (num[i] == 9) return true;
        }
        return false;
    }

    //Array123: Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    public static boolean array123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }

    //String Match: Given 2 strings, a and b, return the number of the positions where they contain the same
    //length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
    //appear in the same place in both strings.
    public static int stringMatch(String a, String b){
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }

    //String X: Given a string, return a version where all the "x" have been removed. Except an "x"
    //at the very start or end should not be removed.
    public static String stringX(String str){
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }

    //Alt Pairs: Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
    //so "kittens" yields "kien".
    public static String altPairs(String str) {
        String result = "";
        for (int i=0; i<str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }

    //String Yak: Suppose the string "yak" is unlucky. Given a string, return a version where
    //all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
    public static String stringYak(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
    //Array 667: Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    public static int array667(int[] nums) {
        int count = 0;
        for (int i=0; i < (nums.length-1); i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
    //No Triples: Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    //Return true if the array does not contain any triples.
    public static boolean noTriples(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int first = nums[i];
            if (nums[i+1]==first && nums[i+2]==first) return false;
        }
        return true;
    }

    //Has 271: Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
    //followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts
    //even if the "1" differs by 2 or less from the correct value.
    public static boolean has271(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val + 5) &&
                    Math.abs(nums[i+2] - (val-1)) <= 2)  return true;
        }

        return false;
    }

}





