import java.io.*;
import java.util.*;

public class Adressbook {

   public HashMap <String , String> contactos = new HashMap<>() ;
    public  void Create (HashMap<String,String>contactos){
        Scanner entrada  = new Scanner(System.in);
        System.out.println("Escribe el numerode la llave");
        String a= entrada.next();


        System.out.println("Escribe el nombre de la llave");
       String  b = entrada.next();
        contactos.put(a,b);}
    public String Delete(HashMap<String,String> contactos){
        String a;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que numero deseas eliminar?");
       a = entrada.nextLine();
       return    contactos.remove(a);}
  public void load (HashMap<String,String>contactos){
      String arch = "C:\\Users\\oswal\\IdeaProjects\\Actividad12\\write.csv";
      BufferedReader bufferedReader = null;
      try {
         File file = new File("C:\\Users\\oswal\\IdeaProjects\\Actividad12\\write.css");
      bufferedReader = new BufferedReader(new FileReader(arch));
          String a  ;
          while ((a = bufferedReader.readLine()) != null) {
              String[]  lista = a.split(":");

              String numero = lista[0];
              String nombre = lista[1];
              if(!numero.equals("")&& !nombre.equals("")){
                  contactos.put(nombre,numero);
              }
          }
      } catch(IOException e) {
          e.printStackTrace();
          System.out.println("error");
      } finally {
          if(bufferedReader!=null) try {bufferedReader.close();}catch (Exception e){}
      }
    }
    public  void list(HashMap<String,String>contactos){

       load(contactos);

       System.out.println("       Contactos: ");
       Iterator it = contactos.entrySet().iterator();
       while (it.hasNext()) {
           Map.Entry pair = (Map.Entry) it.next();

           System.out.println( pair.getValue()  + " : " + pair.getKey());
       }

    }
    public  void save(HashMap<String, String> contactos) {
        String arch = "C:\\Users\\oswal\\IdeaProjects\\Actividad12\\write.csv" ;
        File  file= new File(arch);
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry :
                    contactos.entrySet()) {
                bufferedWriter.write(entry.getKey() + ":"
                        + entry.getValue());

                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
        }   catch (IOException e) {
            e.printStackTrace();

        }  finally {
            try {
                bufferedWriter.close();
            } catch (Exception e){}
        }
  }

}

