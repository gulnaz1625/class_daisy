package practice.String;

public class SumOfDigitsInString {



//    (String) Sum of Digits in a string
//    Write a method that can return the sum of the digits in a string


        public  static int  sumOfDigits(String s) {

            int total = 0;

            char[] ch =  s.toCharArray();

            for(char each: ch) {

                if(Character.isDigit(each)) {

                    total += Integer.valueOf(""+each);

                }

            }

            return total;

        }
    }

