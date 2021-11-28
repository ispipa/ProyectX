package Ejemplo_Join_Array_Threads;

public class Hilo implements Runnable
{

    @Override
    public void run()
    {
        for (int i = 0; i < 500; i++)
        {
            System.out.println("El hilo " + Thread.currentThread().getName() + " va por " + i );
        }
    }
}
