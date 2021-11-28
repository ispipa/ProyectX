package Ejercicio4;

public class Hilos implements Runnable
{

    int cuenta = 0;

    @Override
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println("El hilo " + Thread.currentThread().getName() + " va por " + cuenta);
            cuenta++;
            if((Thread.currentThread().getName().equals("hilo 1"))&&(Thread.currentThread().getName().equals("hilo 2"))&&(Thread.currentThread().getName().equals("hilo 3"))&&(Thread.currentThread().getName().equals("hilo 4"))&&(Thread.currentThread().getName().equals("hilo 5")))
            {
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
