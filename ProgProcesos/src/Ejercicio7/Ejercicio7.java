package Ejercicio7;

import java.io.File;
import java.io.IOException;

public class Ejercicio7
{
    public static void main(String[] args)
    {
        ProcessBuilder pb = new ProcessBuilder("CMD");
        pb.redirectInput(new File("Ejercicio7/ejecutables.bat"));

        try
        {
            pb.start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
