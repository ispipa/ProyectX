import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP
{
    public static void main(String[] args)
    {
        System.out.println("Esperando datagrama...");
        byte[] buffer = new byte[1024];
        DatagramPacket datagramaRecibido = new DatagramPacket(buffer, buffer.length);
        try
        {
            DatagramSocket comunicacion = new DatagramSocket(8080);
            comunicacion.receive(datagramaRecibido);
            String mensajeLeido = new String(datagramaRecibido.getData());
            System.out.println(mensajeLeido);
            comunicacion.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
