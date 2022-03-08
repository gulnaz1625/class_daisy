package practice.Array;
import java.util.Arrays;
import java.util.ArrayList;
public class sortDescend_Array {


//    (Array) Sort Descending
//    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//
//    Ex:  int[] arr = {10,20,70, 80, 90};
//
//    arr = Sort(arr);  ==>  {90, 80, 70, 20, 10};



//    Solution 1:

        public static int[] Sort(int[] a) {

            ArrayList<Integer> list=new ArrayList<Integer>();

            for(int each: a)

                list.add(each);



            for(int i=0; i < a.length; i++) {

                a[i] = findMax(list);

                list.remove(Integer.valueOf(a[i]));

            }

            return a;

        }



        public static int findMax(ArrayList<Integer> a) {

            int max=Integer.MIN_VALUE;

            for(int each: a)

                max = Math.max(max, each);

            return max;

        }



//    Solution 2:

        public static void SortingArrayDesc(int[] arr) {

            for(int i=0; i<arr.length; i++){

                for(int j =0; j < arr.length;j++) {

                    if(arr[i] > arr[j]){

                        int temp = arr[i];

                        arr[i] = arr[j];

                        arr[j] = temp;

                    }

                }
            }

            System.out.println(Arrays.toString(arr));

        }
    }

