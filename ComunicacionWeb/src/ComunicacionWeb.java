import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ComunicacionWeb
{
    public static void main(String[] args)
    {
        String url = "www.google.es";
        int puerto = 80;

        //Comunicacion con TCP
        Socket socket = new Socket();
        InetSocketAddress address = new InetSocketAddress(url, puerto);

        try
        {
            socket.connect(address);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
