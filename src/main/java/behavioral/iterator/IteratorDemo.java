package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorDemo {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("abc");
        lines.add("def");
        lines.add("lol");
        lines.add("hehe");
        lines.add("kek");
        //wysypie się
      /*  for (String line : lines) {
            if (line.equals("def")) {
                lines.remove("def");
            }
            System.out.println(line);
        }*/

        //bezpośrednie wykorzystanie iteratora pozwala na usuniecie elementu podczas iteracji
        //nie można robić tego w for-each
        System.out.println(lines);
        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
            if (text.equals("def")) {
                iterator.remove();  //metoda iteratora!
            }
        }

        System.out.println(lines);


     /*   System.out.println("The ArrayList elements are: ");
        for (String s: lines) {
            System.out.println(s);
        }
        Iterator i = lines.iterator();
        String str = "";
        while (i.hasNext()) {
            str = (String) i.next();
            if (str.equals("def")) {
                i.remove();
                System.out.println("\nThe element Orange is removed");
                break;
            }
        }
        System.out.println("\nThe ArrayList elements are: ");
        for (String s: lines) {
            System.out.println(s);
        }*/


    }


}
