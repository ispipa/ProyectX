package ejemploBuffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LecturaConBuffered
{
    //---Lanzar proceso de CMD
    //---Obtener lecturas con InputStream
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
        Process p = pb.start();

        //---------------LECTURA DEL IMPUTSTREAM------------------//
        InputStream iS = p.getInputStream();
        InputStreamReader iSR = new InputStreamReader(iS);
        BufferedReader bf = new BufferedReader(iSR);
        String line;
        while((line = bf.readLine())!= null)
        {
            System.out.println(line);
        }

        //---------------LECTURA DEL ERRORSTREAM------------------//
        InputStream eRR = p.getErrorStream();
        InputStreamReader eRRR = new InputStreamReader(eRR);
        BufferedReader bf2 = new BufferedReader(eRRR);
        while((line = bf2.readLine())!= null)
        {
            System.out.println(line);
        }
        iS.close();
        iSR.close();
        bf.close();
        eRR.close();
        eRRR.close();
        bf2.close();
    }
}
