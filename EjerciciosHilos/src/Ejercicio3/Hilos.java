package Ejercicio3;

public class Hilos extends Thread
{
    int cuenta = 0;

    @Override
    public void run()
    {
        super.run();
        for (int i = 0; i <= 100; i++)
        {
            System.out.println("El hilo " + Thread.currentThread().getName() + " va por " + cuenta);
            cuenta++;
            if(cuenta == 100)
            {
                System.out.println("El hilo " + Thread.currentThread().getName() + " ha ganado");
            }
        }
    }
}
