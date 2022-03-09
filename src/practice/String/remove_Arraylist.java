package practice.String;
import java.util.*;

public class remove_Arraylist {





        public static void main(String[] args) {
//        (ArrayList) Remove "Amed"
//        Given a list of people' names: "Amed", "hello", Eric", "mike".....
//        Write a java operation to remove all the names named Ahmed

//        Solution 1:

            ArrayList<String> names = new ArrayList<>(Arrays.asList("Amed", "hello", "Eric", "mike"));

            names.removeAll( Arrays.asList("Amed"));



            System.out.println(names);



//        Solution 2:

            List<String> names2 = new ArrayList<>(Arrays.asList("Amed", "hello", "Eric", "mike"));

            for(ListIterator<String> it = names2.listIterator(); it.hasNext();)

                if(it.next().equals("Amed"))

                    it.remove();



            System.out.println(names);

            // Solution 3:

            List<String> names3 = new ArrayList<>(Arrays.asList("Amed", "hello", "Eric", "mike"));

            List<String> names32 = new ArrayList<>();

            names.forEach(p-> {if(p.equals("Amed")) names32.add(p);}  );



            System.out.println(names3);



//        Solution 4:

            List<String> names4 = new ArrayList<>(Arrays.asList("Amed", "hello", "Eric", "mike"));

            Iterator<String> it = names.iterator();

            while(it.hasNext()) {

                if(it.next().equals("Amed"))

                    it.remove();

            }

            System.out.println( names4 );

        }
    }

