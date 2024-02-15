package heritage;

import heritage.model.*;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hellow world");
        System.out.println("Bienvenue");
        Example example1 = new Example();
        Example example2 = new Example("Example2", 21);

        System.out.println(example1.getName());
        System.out.println(example2.getName());

        example1.setName("Example1");
        example1.setAge(40);

        System.out.println(example1.presenter());
        System.out.println(example2.presenter());

        System.out.println(example1);
        System.out.println(example2);

        System.out.println("\n ------------------------------------------------------ \n");


        FilsA filsA = new FilsA("filsA");
        System.out.println(filsA.paroleDeFils());

        System.out.println("\n ------------------------------------------------------ \n");

        FilsB filsB = new FilsB("filsB");
        System.out.println(filsB.paroleDeFils());


        List<Pere> listeDePere = List.of(filsA, filsB);

        for (Pere membre : listeDePere){
            System.out.println("\n ------------------------------------------------------ \n");
            System.out.println(membre.getClass());
            System.out.println(membre.paroleDeFils());
        }


    }
}
