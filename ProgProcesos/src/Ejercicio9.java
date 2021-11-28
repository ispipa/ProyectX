import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9
{

    public static void main(String[] args)
    {
        int min = -1;
        int max = -1;
        try
        {
            while(min < 0 || min > 255)
            {
                System.out.println("Introduce una entrada minima correcta de host");
                InputStreamReader iSR = new InputStreamReader(System.in);
                BufferedReader bf = new BufferedReader(iSR);
                String lineaLeida = bf.readLine();
                min = Integer.parseInt(lineaLeida);
            }
            while(max < 0 || max > 255)
            {
                System.out.println("Introduce una entrada maxima correcta de host");
                InputStreamReader iSR = new InputStreamReader(System.in);
                BufferedReader bf = new BufferedReader(iSR);
                String lineaLeida = bf.readLine();
                min = Integer.parseInt(lineaLeida);
            }
            System.out.println("Se va a lanzar un ping de la maquina 192.168.1." + min + " a la 192.168.1." + max);

            for (int i = min; i < max; i++)
            {
                System.out.println("Lanzando ping a 192.168.1." + i);
                ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "ping", "192.168.1." + i);
                pb.redirectOutput(new File(".\\resultados\\ping" + i + ".txt"));
                Process p = pb.start();

                p.waitFor();
            }
        }
        catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
