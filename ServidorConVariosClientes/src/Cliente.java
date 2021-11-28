import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente
{
    public static void main(String[] args)
    {
        int puerto = 80;
        String host = "localhost";
        InetSocketAddress address = new InetSocketAddress(host, puerto);
        Socket cliente = new Socket();
        try
        {
            cliente.connect(address);
            //como cliente voy a escribir al servidor y le voy a pasar un objeto
            //para que funcione lo casteo convirtiendolo en un ObjectOutputStream
            OutputStream oS = cliente.getOutputStream();
            //paso al write el metodo escribir objeto, el cual es el objeto que he pasado de persona
            oS.write("Guapetón ".getBytes());
            oS.flush(); //libera memoria
            oS.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
