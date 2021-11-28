import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ConsumirWeb
{
    public static void main(String[] args)
    {
        try
        {
            URL urlDescarga = new URL("https://www.listchallenges.com/100-places-to-visit");
            InputStream iS = urlDescarga.openStream();
            InputStreamReader iSR = new InputStreamReader(iS);
            BufferedReader bf = new BufferedReader(iSR);

            String linea  = "";
            String total = "";
            while((linea = bf.readLine()) != null)
            {
                System.out.println(linea);
                total += linea;
            }
            bf.close();
            iSR.close();
            iS.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
