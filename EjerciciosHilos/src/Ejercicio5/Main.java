package Ejercicio5;

public class Main
{
    public static void main(String[] args)
    {
        Hilos[] hilo = new Hilos[5];
        for (int i = 0; i < hilo.length; i++)
        {
            hilo[i] = new Hilos();
            hilo[i].setName("Hilo " + (i + 1));
            hilo[i].start();
        }


        for (int i = 0; i < 5; i++)
        {
            try
            {
                hilo[i].join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        hacerMedia();
    }
    static void hacerMedia()
    {
        int suma = 0;
        int res;
        for (int i = 0; i < Hilos.arrayComun.length; i++)
        {
            suma += Hilos.arrayComun[i];
        }
        System.out.println("Suma total: " + suma);
        res = suma / Hilos.arrayComun.length;
        System.out.println("Media: " + res);
    }
}
