import java.io.IOException;
import java.net.*;

public class ClienteUDP
{
    public static void main(String[] args)
    {
        String msj = "Hola, servidor";
        int puertoDestino = 8080;
        //la direccion de envio del datagrama es localhost
        try
        {
            //quien soy, cojo nombre de mi host
            InetAddress dirEnvio = InetAddress.getLocalHost();
            DatagramPacket datagrama = new DatagramPacket(msj.getBytes(), msj.length(), dirEnvio, puertoDestino);

            //unicamente es datagramsocket en el modelo UDP
            DatagramSocket cliente = new DatagramSocket(1234);

            //el cliente envia el datagrama al servidor
            cliente.send(datagrama);
            System.out.println("El datagrama ha sido enviado");
            cliente.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
