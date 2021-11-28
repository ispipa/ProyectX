package ejercicio4;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio4
{
    public static void main(String[] args) throws IOException
    {
        ProcessBuilder pb = new ProcessBuilder("CMD","/C", "ping", "127.0.0.1");
        pb.directory(new File("D:\\2ºGDAM\\PSP\\ProgProcesos\\out\\production\\ProgProcesos\\"));

            Process p = pb.start();
            InputStream iS = p.getInputStream();
            int c;
            while((c = iS.read()) != -1)
            {
                System.out.print((char)c);
            }
    }
}
