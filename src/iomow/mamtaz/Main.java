package iomow.mamtaz;

        import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> number1 = new ArrayList<>();

        System.out.println("size = " + number.size());

        //adding elements
        number.add("50");
        number.add("30");
        number.add("40");
        System.out.println("First String :" +number);
        number1.add("a");
        number1.add("b");
        number1.add("c");
        System.out.println("2nd String :" + number1);

        //

        Collections.copy(number,number1);
        System.out.println("After copy :" + number);



        //number.set(1,60);
        //System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;");
        //System.out.println(number);


        //System.out.println("size = " + number.size());
    }
}
