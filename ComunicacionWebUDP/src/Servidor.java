import java.io.*;
import java.net.*;

public class Servidor
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Waiting...");
            ServerSocket socketServidor = new ServerSocket(80);
            Socket cliente = socketServidor.accept();

            ObjectInputStream oIS = new ObjectInputStream(cliente.getInputStream());
            Persona usuario = (Persona) oIS.readObject();

            System.out.println(usuario.getNombre() + ", " + usuario.getEdad() + ", " + usuario.getContraseña());

            oIS.close();
            socketServidor.close();
            cliente.close();

        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
