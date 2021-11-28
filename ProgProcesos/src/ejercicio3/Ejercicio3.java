package ejercicio3;

import java.io.*;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        InputStreamReader iSR = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(iSR);
        System.out.println("Escriba nombre");
        try
        {

            //obtiene lecturas del input del usuario
            String input = bf.readLine();
            System.out.println("Escriba primer apellido");
            String input1 = bf.readLine();
            System.out.println("Escriba segundo apellido");
            String input2 = bf.readLine();


            ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio1", input, input1, input2);
            pb.directory(new File("E:\\2ºGDAM\\PSP\\ProgProcesos\\out\\production\\ProgProcesos\\"));
            Process p = pb.start();
            //lectura del proceso
            InputStream iS =p.getInputStream();
            iSR = new InputStreamReader(iS);
            bf = new BufferedReader(iSR);

            String msj = "";

            while((msj = bf.readLine()) !=null)
            {
                System.out.println(msj);
            }
            iSR.close();
            bf.close();
            iS.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
