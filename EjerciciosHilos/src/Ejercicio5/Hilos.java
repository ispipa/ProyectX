package Ejercicio5;

import java.util.Random;

public class Hilos extends Thread
{
    static int[] arrayComun = new int[1000];

    @Override
    public void run()
    {
        super.run();

        switch (currentThread().getName())
        {
            case "Hilo 1":
                numAleatorios(0, 249);
                break;
            case "Hilo 2":
                numAleatorios(250, 499);
                break;
            case "Hilo 3":
                numAleatorios(500, 749);
                break;
            case "Hilo 4":
                numAleatorios(750, 999);
                break;
        }
    }

    void numAleatorios(int min, int max)
    {
        Random r = new Random();
        for (int i = min; i < max; i++)
        {
            int numAle = r.nextInt(1001) - 500;
            System.out.println("El hilo " + currentThread().getName() + " ha generado el numero " + numAle + " en la posicion " + i);
            arrayComun[i] = numAle;
        }
    }
}
