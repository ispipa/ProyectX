package cliente_servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket server = new ServerSocket(80);
            System.out.println("Esperando...");

            //obtengo la referencia del cliente conectado
            Socket cliente = server.accept();

            //obtengo de InputStream para poder leerle
            InputStream iS = cliente.getInputStream();
            InputStreamReader iSR = new InputStreamReader(iS);
            BufferedReader bf = new BufferedReader(iSR);

            String linea = "";
            while((linea = bf.readLine()) != null)
            {
                System.out.println(linea);
            }
            iS.close();
            iSR.close();
            bf.close();
            server.close();
            cliente.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
