import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Servidor //arbitro
{
    public static void main(String[] args)
    {
        int numAdivinar;
        int contadorClientes = 1;
        Random r = new Random();
        try
        {
            ServerSocket socket = new ServerSocket(80);
            //numero aleatorio entre -10 y 10 ambos inclusive
            numAdivinar = r.nextInt(21) - 10;
            //aqui es donde vamos a alojar la informacion del numero a adivinar
            //los juagadores se tienen que ir alternando y necesitan un objeti en comun
            ObjetoCompartido objCompartido = new ObjetoCompartido(numAdivinar);

            System.out.println("El numero a adivinar es el: " + numAdivinar);
            while(true)
            {
                Socket clienteNuevo = socket.accept();
                //derivamos a cada cliente nuevo a un hilo nuevo, que viene de HiloServidor
                HiloServidor hilo = new HiloServidor(clienteNuevo, objCompartido);
                hilo.setName("Cliente " + contadorClientes);
                hilo.start();
                contadorClientes++;
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
