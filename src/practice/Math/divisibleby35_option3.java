package practice.Math;

import java.util.ArrayList;
import java.util.List;

public class divisibleby35_option3 {


//    Solution 3:



    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i < 100; i++)

            list.add(i+1);



        System.out.print("Divisible By 15: ");

        list.forEach( p -> { if(p%15==0 && p%3==0) System.out.print(p+" "); } ) ;

        System.out.print("\nDivisible By 5: ");

        list.forEach( p -> { if(p%5==0 && p%15!=0) System.out.print(p+" "); } ) ;

        System.out.print("\nDivisible By 3: ");

        list.forEach( p -> { if(p%3==0 && p%15!=0) System.out.print(p+" "); } ) ;

    }
}
