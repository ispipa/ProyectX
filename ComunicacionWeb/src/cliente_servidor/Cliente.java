package cliente_servidor;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente
{
    public static void main(String[] args)
    {
        String url = "localhost";
        int puerto = 80;

        Socket socket = new Socket();
        InetSocketAddress address = new InetSocketAddress(url, puerto);

        try
        {
            socket.connect(address);
            OutputStream oS = socket.getOutputStream(); //soy el cliente y voy a escribir al servidor
            oS.write("Buenos días, servidor".getBytes()); //paso un mensaje convertido en bytes
            //porque el TCP solo envía bytes
            oS.close();
            socket.close();
            System.out.println("Conexion perfecta");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Conexion perfecta");
    }
}
