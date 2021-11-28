package Ejercicio6;

public class Consumidor implements Runnable
{
    Cola colaCompartida;

    public Consumidor(Cola colaCompartida)
    {
        this.colaCompartida = colaCompartida;
    }

    @Override
    public void run()
    {
        while(true)
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
