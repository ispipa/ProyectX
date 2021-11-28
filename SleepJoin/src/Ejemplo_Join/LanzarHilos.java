package Ejemplo_Join;

public class LanzarHilos
{
    public static void main(String[] args)
    {
        Thread hilo1 = new Thread(new Hilo());
        Thread hilo2 = new Thread(new Hilo());
        hilo1.start();
        try
        {
            hilo1.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        hilo2.start();
    }
}
