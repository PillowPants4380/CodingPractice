package Utils;

public class Functions {


    public static String nonStart(String a, String b){
        //Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
        //
        //
        //nonStart("Hello", "There") → "ellohere"
        //nonStart("java", "code") → "avaode"
        //nonStart("shotl", "java") → "hotlava"
        return a.substring(1) + b.substring(1);
    }

    public static String left2(String str){
        //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
        //
        //
        //left2("Hello") → "lloHe"
        //left2("java") → "vaja"
        //left2("Hi") → "Hi"

        return (str.substring(2) + str.substring(0,2));
    }

    public static String right2(String str){
        //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }

    public static String theEnd(String str, boolean front){
        //Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
        //
        //
        //theEnd("Hello", true) → "H"
        //theEnd("Hello", false) → "o"
        //theEnd("oh", true) → "o"
        String returnString;

        if(front){
            returnString = str.substring(0,1);
        }else{
            returnString = str.substring(str.length()-1);
        }
        return returnString;

    }

    public static String withoutEnd2(String str){
        //Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
        //
        //
        //withouEnd2("Hello") → "ell"
        //withouEnd2("abc") → "b"
        //withouEnd2("ab") → ""


        System.out.println(str.length());
        if(str.length() > 1) {
            return str.substring(1, str.length() - 1);
        }else{
            return str;
        }
    }


    public static String middleTwo(String str){
        //Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
        //
        //
        //middleTwo("string") → "ri"
        //middleTwo("code") → "od"
        //middleTwo("Practice") → "ct"

        int strMiddle = str.length()/2;

        return str.substring(strMiddle - 1, strMiddle + 1 );
    }

    public static boolean endsly(String str){
        if(str.length() > 1) {
            return (str.substring(str.length() - 2).equalsIgnoreCase("ly"));
        }else{
            return false;
        }
    }

    public static String nTwice(String str, int n){


        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public static String twoChar(String str, int index){
        //Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2,
        // use the first 2 chars. The string length will be at least 2.
        //
        //
        //twoChar("java", 0) → "ja"
        //twoChar("java", 2) → "va"
        //twoChar("java", 3) → "ja"
        String newString;
        if ((index + 1 >= str.length()) || (index < 0)){
            newString = str.substring(0,2);
        }else{
            newString = str.substring(index, index + 2);
        }
        if (newString.length() >= 2){
            return newString;
        }else{
            return str.substring(0,2);
        }
    }

    public static String middleThree(String str){
        //Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
        //
        //
        //middleThree("Candy") → "and"
        //middleThree("and") → "and"
        //middleThree("solving") → "lvi"
        String newStr;
        if (str.length() <= 3){
            newStr = str;
        }else {
            int offSet = (str.length() - 3) / 2;
            newStr = str.substring(offSet, offSet + 3);
        }
        return newStr;
    }

    public static boolean hasBad(String str){
        //Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not
        // "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        //
        //
        //hasBad("badxx") → true
        //hasBad("xbadxx") → true
        //hasBad("xxbadxx") → false

        if (str.length() == 3) {
            return str.substring(0,3).equals("bad");
        }else if (str.length() > 3){
            return (str.substring(0,3).equals("bad")) || (str.substring(1,4).equals("bad"));
        }
        return false;
    }

    public static String atFirst(String str){
        //Given a string, return a string length 2 made of its first 2 chars. If the
        // string length is less than 2, use '@' for the missing chars.
        //
        //
        //atFirst("hello") → "he"
        //atFirst("hi") → "hi"
        //atFirst("h") → "h@"
        String returnString;
        if(str.length() >= 2){
            returnString = str.substring(0,2);
        }else if(str.length() == 1){
            returnString = str.charAt(0) + "@";
        }else{
            returnString = "@@";
        }
        return returnString;
    }

    public static String lastChars(String a, String b){
        //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java"
        // yields "ya". If either string is length 0, use '@' for its missing char.
        //
        //
        //lastChars("last", "chars") → "ls"
        //lastChars("yo", "java") → "ya"
        //lastChars("hi", "") → "h@"

        String charA;
        String charB;

        if (a.length() == 0){
            charA = "@";
        }else{
            charA = a.substring(0, 1);
        }
        if(b.length() == 0){
            charB = "@";
        }else{
            charB = b.substring(b.length() - 1);
        }
        return charA + charB;
    }

    public static String conCat(String a, String b){
        //Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation
        // creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        //
        //
        //conCat("abc", "cat") → "abcat"
        //conCat("dog", "cat") → "dogcat"
        //conCat("abc", "") → "abc"
        String newStr;
        String lastChar;
        String firstChar;
        if(a.length() == 0 || b.length() == 0){
            newStr = a + b;
        }else{
            lastChar = a.substring(a.length()-1);
            firstChar = b.substring(0, 1);
            if(lastChar.equalsIgnoreCase(firstChar)){
                newStr = a + b.substring(1);
            }else{
                newStr = a + b;
            }
        }
        return newStr;
    }

    public static String lastTwo(String str){
        //Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so
        // "coding" yields "codign".
        //
        //
        //lastTwo("coding") → "codign"
        //lastTwo("cat") → "cta"
        //lastTwo("ab") → "ba"

        String front;
        String a;
        String b;
        String newStr;

        if(str.length() > 2){
            front = str.substring(0,str.length()-2);
            a = str.substring(str.length()-2, str.length()-1);
            b = str.substring(str.length() - 1);
            newStr = front + b + a;
        }else if(str.length() > 1){
            a = str.substring(0,1);
            b = str.substring(1);
            newStr = b + a;
        }else{
            newStr = str;
        }
        return newStr;
    }

    public static String seeColor(String str){
        String newStr;

        if(str.indexOf("red") == 0){
            newStr = "red";
        }else if (str.indexOf("blue") == 0){
            newStr = "blue";
        }else{
            newStr = "";
        }
        return newStr;
    }

    public static boolean frontAgain(String str){
        boolean frontEndMatch = false;
        if(str.length() >= 2){
            String frontTwo = str.substring(0,2);
            String endTwo = str.substring(str.length() -2);
            if(frontTwo.equalsIgnoreCase(endTwo)){
                frontEndMatch = true;
            }
        }
        return frontEndMatch;
    }


}
