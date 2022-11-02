import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args)   {
        Scanner entrada = new Scanner(System.in);
        Adressbook adressbook = new Adressbook();
        adressbook.guardar(adressbook.contactos);

        adressbook.getContactos();
       System.out.println(Arrays.asList(adressbook.contactos));
 System.out.println(Collections.singletonList(adressbook.contactos));
    }
}
