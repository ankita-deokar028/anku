package ab47;
import java.util.ArrayList;
import java.util.Collection;

public class ContainsMethodExample {
    public static void main(String[] args) {
        
        Collection<String> C1 = new ArrayList<>();
        C1.add("Nisha");
        C1.add("Akshu");
        C1.add("Divu");
        C1.add("Anku");
        C1.add("Swami");


        String searchElement1 = "Shiv";
        String searchElement2 = "Datta";

        
        System.out.println("Collection: " + C1);
        System.out.println();

        System.out.println("Does the collection contain"  +  searchElement1  
                + C1.contains(searchElement1));

        System.out.println("Does the collection contain "+ searchElement2 + C1.contains(searchElement2));
    }
}
