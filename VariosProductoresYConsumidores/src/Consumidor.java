//se comporta como hilo
public class Consumidor implements Runnable
{
    Cola colaCompartida;

    //hago el constructor
    public Consumidor(Cola colaCompartida)
    {
        this.colaCompartida = colaCompartida;
    }

    @Override
    public void run()
    {
        while(true) //hago un bucle infinito del productor, que produzca cada 1 segundo
        {
            try
            {
                colaCompartida.get();
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
