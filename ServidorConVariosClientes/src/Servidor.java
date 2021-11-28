import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Servidor
{
    public static void main(String[] args)
    {
        int numCliente = 1;
        try
        {
            ServerSocket servidor = new ServerSocket(80);
            Socket cliente;

            while(true) //esto lo hago porque quiero que se haga cada vez que se una un cliente nuevo
            {           //los derivo cada uno a un hilo nuevo
                System.out.println("Waiting...");
                cliente  = servidor.accept();
                //meto cliente porque como parametro de entrada requiere un Socket, en este caso cliente
                HiloServidor hilo = new HiloServidor(cliente);
                hilo.setName("Cliente " + numCliente);
                hilo.start();
                numCliente++;
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
