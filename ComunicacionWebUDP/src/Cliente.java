import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente
{
    public static void main(String[] args)
    {
        Persona usuario = new Persona("Zakarias", 23, 333);
        int puerto = 80;
        String host = "192.168.1.219";
        InetSocketAddress adress = new InetSocketAddress(host, puerto);
        Socket cliente = new Socket();
        try
        {
            cliente.connect(adress);
            //como cliente voy a escribir al servidor y le voy a pasar un objeto
            //para qque funcione lo casteo convirtiendolo en un ObjectOutputStream
            ObjectOutputStream oS = new ObjectOutputStream(cliente.getOutputStream());
            //paso al write el metodo escribir objeto, el cual es el objeto que he pasado de persona
            oS.writeObject(usuario);
            oS.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
