import java.io.*;

public class Ejercicio6
{

    public static void main(String[] args) throws IOException {

        try
        {
            FileReader reader = new FileReader("entrada1.txt");
            BufferedReader bf = new BufferedReader(reader);
            String lineaLeida = "";
            FileWriter writer = null;

            FileReader reader2 = new FileReader("entrada2.txt");
            BufferedReader bf2 = new BufferedReader(reader2);
            String lineaLeida2 = "";

            FileReader reader3 = new FileReader("entrada3.txt");
            BufferedReader bf3 = new BufferedReader(reader3);
            String lineaLeida3 = "";

            while((lineaLeida = bf.readLine()) != null)
            {
                while((lineaLeida2 = bf2.readLine()) != null)
                {
                    while((lineaLeida3 = bf3.readLine()) != null)
                    {
                        System.out.println(lineaLeida + " " + lineaLeida2 + " " + lineaLeida3);
                        File ficheroSalida = new File("salida.txt");
                        writer = new FileWriter(ficheroSalida);
                        int numLeido1 = Integer.parseInt(lineaLeida);
                        int numLeido2 = Integer.parseInt(lineaLeida2);
                        int numLeido3 = Integer.parseInt(lineaLeida3);
                        writer.write(String.valueOf(numLeido1 * numLeido2 * numLeido3));
                    }
                }

            }
            bf.close();
            reader.close();
            bf2.close();
            reader2.close();
            writer.close();
            bf3.close();
            reader3.close();

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
