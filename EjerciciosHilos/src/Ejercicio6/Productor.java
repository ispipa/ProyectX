package Ejercicio6;

import java.util.Random;

public class Productor implements  Runnable
{
    Cola colaCompartida;

    public Productor(Cola colaCompartida)
    {
        this.colaCompartida = colaCompartida;
    }

    @Override
    public void run()
    {

        for (int i = 0; i < 30; i++)
        {
            try
            {
                colaCompartida.set(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
