import java.util.Random;

//se comporta como hilo
public class Productor implements Runnable
{
    Cola colaCompartida;

    public Productor(Cola colaCompartida)
    {
        this.colaCompartida = colaCompartida;
    }

    @Override
    public void run()
    {
        Random r = new Random();
        while(true) //hago un bucle infinito del productor, que produzca cada 1 segundo
        {
            //de -50 a 90
            //producimos numeros
            int numAle = r.nextInt(141) - 50;
            try
            {
                colaCompartida.put(numAle);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
