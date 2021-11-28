package Ejercicio3;

import java.util.Random;

public class Caballo implements Runnable
{
    int puntuacion;
    static int puesto = 0;
    Random r = new Random();

    public Caballo(int puntuacion)
    {
        this.puntuacion = puntuacion;
    }

    @Override
    public void run()
    {
        while(puntuacion < 100)
        {
            puntuacion += r.nextInt(16) +1;
            System.out.println(Thread.currentThread().getName() + " lleva " + puntuacion + " puntos");
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        puesto++;
        System.out.println("El caballo " + Thread.currentThread().getName() + " ha finalizado y su puesto es el: " + puesto);

    }
}
