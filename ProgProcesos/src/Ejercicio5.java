import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ejercicio5
{

    public static void main(String[] args)
    {
        File ficheroEntrada1 = new File("entrada1.txt");
        File ficheroEntrada2 = new File("entrada2.txt");
        File ficheroEntrada3 = new File("entrada3.txt");

        FileWriter writer1 = null;
        FileWriter writer2 = null;
        FileWriter writer3 = null;

        int numSalida1;
        int numSalida2;
        int numSalida3;

        try
        {
            writer1 = new FileWriter(ficheroEntrada1);
            writer2 = new FileWriter(ficheroEntrada2);
            writer3 = new FileWriter(ficheroEntrada3);
            int max = 1000;
            int min = 1;
            int range = max - min + 1;
             numSalida1 = (int)(Math.random()*range) + min;
             numSalida2 = (int)(Math.random()*range) + min;
             numSalida3 = (int)(Math.random()*range) + min;
            writer1.write(String.valueOf(numSalida1));
            writer2.write(String.valueOf(numSalida2));
            writer3.write(String.valueOf(numSalida3));

            writer1.close();
            writer2.close();
            writer3.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        /*for (int i = 0; i < 3; i++)
        {
            File ficheroEntrada = new File("entrada" + (i + 1) + ".txt");

            try
            {
                FileWriter writer = new FileWriter(ficheroEntrada);
                Random r = new Random();
                int rnd = r.nextInt(1000);
                writer.write(String.valueOf(rnd));
                writer.flush();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }*/
    }
}
