import java.util.ArrayList;

public class Basic {

    public static void main(String[] args) {

        ArrayList<Object> a1 = new ArrayList<>();
        a1.add("Samsung-101");
        a1.add("Apple-102");
        a1.add(55000);
        a1.add(96523.02145);
        a1.add(true);
        System.out.println(a1.toString());

//add all

      // System.out.println(a1.toString());
        ArrayList<Object> a2 = new ArrayList<>();
        a2.addAll(a1);
        System.out.println(a2.toString());

// remove

     //  System.out.println(a1.toString());
        a1.remove(0);
        a1.remove(true);
        System.out.println("After removing"+ a1.toString());
    }
}
