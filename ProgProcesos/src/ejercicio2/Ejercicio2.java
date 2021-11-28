package ejercicio2;

import java.io.File;
import java.io.IOException;

public class Ejercicio2
{
    public static void main(String[] args)
    {
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio1", "Alejandro", "Fernandez", "Roldan");
        pb.directory(new File("E:\\2ºGDAM\\PSP\\ProgProcesos\\out\\production\\ProgProcesos\\"));
        try
        {
            pb.start();
            //no aparecen los datos del Ejercicio1 porque deberíamos leer la salida del proceso con InputStream
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
