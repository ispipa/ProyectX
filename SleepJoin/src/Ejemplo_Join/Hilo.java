package Ejemplo_Join;

public class Hilo implements Runnable
{
    int cuenta = 0;
    @Override
    public void run()
    {
        for (int i = 0; i < 250; i++)
        {
            System.out.println("El hilo " + Thread.currentThread().getName() + " va por el " + cuenta);
            cuenta++;
        }
    }
}
