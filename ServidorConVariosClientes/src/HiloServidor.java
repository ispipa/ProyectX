import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class HiloServidor extends Thread
{
    Socket clienteNuevo;
    InputStream iS;
    InputStreamReader iSR;
    BufferedReader bf;

    public HiloServidor(Socket clienteNuevo)
    //utilizamos el constructor para recibir al cliente
    //dando de este modo valor al socket declarado como global
    //en el constructor estamos dando valor a las propiedades de la clase
    {
        this.clienteNuevo = clienteNuevo;
        try
        {
            //lee al cliente nuevo
            iS = this.clienteNuevo.getInputStream();
            iSR = new InputStreamReader(iS);
            bf = new BufferedReader(iSR);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public void run()
    {
        super.run();
        System.out.println("Recibo al cliente... " + currentThread().getName());

        //esto me lo he traido de servidor porque nunca se sale del while
        //por tanto esto nunca se ejecutaria
        String linea = "";
        try
        {
            linea = bf.readLine();
            System.out.println(linea);

            iS.close();
            iSR.close();
            bf.close();
            clienteNuevo.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
