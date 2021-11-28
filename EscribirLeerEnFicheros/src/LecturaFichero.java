import java.io.*;

public class LecturaFichero
{
    public static void main(String[] args)
    {
        File ficheroEntrada = new File("entrada.txt");
        try
        {
            FileReader reader = new FileReader(ficheroEntrada);
            BufferedReader bf = new BufferedReader(reader);
            String lineaLeida = "";
            while((lineaLeida = bf.readLine()) != null)
            {
                System.out.print(lineaLeida);
            }
            bf.close();
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
