import java.io.File;
import java.io.InputStream;
import java.util.*;

public class main {
    public static void main(String[] args)   {
        menu();}
    private static void menu() {
       try{ int r1,r2;
        Scanner entrada = new Scanner(System.in);
        Adressbook adressbook = new Adressbook();
        System.out.println("Bienvenido presiona cualquiera de las siguientes opciones: ");
        System.out.println("1 para agregar un contacto: "+ "\n"
                +"2 para mostrar la lista de contactos"+"\n"
                +"3 Eliminar un contactos " + "\n"
                +"4 Eliminar todos los contactos de la agenda "+ "\n"
                +"0 Para salir de la agenda");
        r1 = entrada.nextInt();
        if(r1==1){
            adressbook.load(adressbook.contactos);
           adressbook.Create(adressbook.contactos);
            adressbook.save(adressbook.contactos);
            System.out.println("Presiona 1 para volver al menu");
            r2 = entrada.nextInt();
            if(r2==1){menu();}
        }
       else  if(r1==2){
           adressbook.list(adressbook.contactos);
           System.out.println("Presiona 1 para volver al menu");
            r2 = entrada.nextInt();
            if(r2==1){menu();}
        }
        else if(r1==3){
            adressbook.load(adressbook.contactos);
            adressbook.Delete(adressbook.contactos);
            adressbook.save(adressbook.contactos);
            System.out.println("Presiona 1 para volver al menu");
            r2 = entrada.nextInt();
            if(r2==1){menu();}
        } else if(r1==4){
            adressbook.load(adressbook.contactos);
            adressbook.contactos.clear();
            System.out.println("Se ha eliminado toda la agenda");
            adressbook.save(adressbook.contactos);
            System.out.println("Presiona 1 para volver al menu");
            r2 = entrada.nextInt();
            if(r2==1){menu();}}
        else if(r1 == 0){System.out.println("Has salido del programa");
        }
        else if((r1 < 0) || (r1> 4)) {
            throw new IllegalArgumentException("Esta opcion no existe.");
       }
    }catch (InputMismatchException e)  {
           System.out.println("Escribiste una letra,  debes escribir un numero" );
           menu();}
       catch (IllegalArgumentException e) {
           System.out.println("Esta opcion no existe");
           menu();}
    }


}
