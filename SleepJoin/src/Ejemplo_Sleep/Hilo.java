package Ejemplo_Sleep;

public class Hilo implements Runnable
{

    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("El hilo " + Thread.currentThread().getName() + " va por " + i);
            if(Thread.currentThread().getName().equals("Thread-0"))
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
