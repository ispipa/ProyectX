import java.net.Socket;

public class HiloServidor extends Thread
{
    Socket clienteNuevo;
    ObjetoCompartido objCompartido;
    public  HiloServidor(Socket clienteNuevo, ObjetoCompartido objCompartido)
    {
        this.clienteNuevo = clienteNuevo;
        this.objCompartido = objCompartido;
    }

    @Override
    public void run()
    {
        super.run();
    }
}
