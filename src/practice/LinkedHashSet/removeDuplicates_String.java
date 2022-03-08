package practice.LinkedHashSet;
import java.util.Arrays;
import java.util.LinkedHashSet;



    public class removeDuplicates_String {

//    (String) Remove Duplicates
//    Write a return method that can remove the duplicated values from String
//
//    Ex:  removeDup("AAABBBCCCDDD")  ==> ABCD



//    Solution 1:

        public static  String  removeDup1( String  str) {

            String result = "";

            for (int i = 0; i < str.length(); i++)

                if (!result.contains("" + str.charAt(i)))

                    result += "" + str.charAt(i);



            return result;

        }



//    Solution 2:

        public static String removeDup2(String str) {

            str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

            str = str.replace(", " ,  "" ).replace("[","").replace("]","");

            return  str;

        }
    }

