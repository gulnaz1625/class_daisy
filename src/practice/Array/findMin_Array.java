package practice.Array;
import java.util.Arrays;
public class findMin_Array {


//    (Array) Find Minimum
//    Write a method that can find the maximum number from an int Array



//    Solution 1:

        public static int minValue1( int[]  n ) {

            int min = Integer.MAX_VALUE;

            for(int each: n)

                if(each < min)

                    min = each;



            return min;

        }



//    Solution 2:

        public static int minValue2( int[]  n ) {

            Arrays.sort( n );

            return  n [ 0 ];

        }
    }
