import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.*;

public class Adressbook {

    public HashMap <String , String> contactos = new HashMap<>() ;
    public  String a;
    public  String b;
    final static String outputFilePath
            = "D:\\carpetajava\\write.txt";

  public String getContactos(){
      Scanner entrada  = new Scanner(System.in);
      System.out.println("Escribe el numerode la llave");
      a= entrada.nextLine();
      a = contactos.keySet().toString();
      System.out.println("Escribe el nombre de la llave");
      b = entrada.nextLine();


  return  contactos.put(a,b);}

public String showcontactos(){

      contactos = new HashMap<>();
    Arrays.toString(contactos.entrySet().toArray());

return Arrays.toString(contactos.entrySet().toArray());}

    public  void guardar(HashMap<String, String> contactos) {
        String outputFilePath
                = "D:\\carpetajava\\write.txt";
        File  file= new File(outputFilePath);
        BufferedWriter bufferedWriter = null;
        Iterator<String>iterator = contactos.keySet().iterator();
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

