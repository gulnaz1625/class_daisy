package practice.Array;
import java.util.ArrayList;
public class sortAscend_Array {


//    (Array) Sort Ascending
//    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//
//    Ex:
//
//    int[] arr = {100, 90, 85, 71};
//
//    arr = Sort(arr);         ==>{ 71, 85, 90, 100};



//    Solution 1:

        public static int[] Sort(int[] a) {

            ArrayList<Integer> list=new ArrayList<Integer>();

            for(int each: a)

                list.add(each);



            for(int i=0; i < a.length; i++) {

                a[i] = findMin(list);

                list.remove(Integer.valueOf(a[i]));

            }

            return a;

        }

        public static int findMin(ArrayList<Integer> a) {

            int min =Integer.MAX_VALUE;

            for(int each: a)

                min = Math.min(min, each);

            return min;

        }



//    Solution 2:

        public static void SortingArrayAsc(int[] arr) {

            ArrayList<Integer> list = new ArrayList();

            for(int each: arr) {

                list.add(each);

            }

            for (int i = 0; i < list.size(); i++) {

                for (int j = 0; j < list.size(); j++) {

                    if (list.get(i) < list.get(j)) {

                        Integer temp = list.get(i);

                        list.set(i, list.get(j));

                        list.set(j, temp);

                    }

                }

            }

            for(int i=0; i < list.size(); i++) {

                arr[i] = list.get(i);

            }

        }
    }
