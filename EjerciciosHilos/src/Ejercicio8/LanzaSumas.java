package Ejercicio8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class LanzaSumas implements Runnable
{
    int menor;
    int mayor;
    int sumaTotal = 0;
    int numMenor;
    int numMayor;
    @Override
    public void run()
    {
        Instant start = Instant.now();
        sumasA();
        Instant end = Instant.now();
        Duration time = Duration.between(start, end);
        System.out.println(time);

    }
    private void sumasA()
    {

        if(Thread.currentThread().getName().equals("hilo 1"))
        {
            menor = 1;
            mayor = 125;
            for (int i = menor; i <= mayor ; i++)
            {
                sumaTotal += i;
            }
            System.out.println("Suma total es de " + sumaTotal);
            File fichero = new File("D:\\2ºGDAM\\PSP\\EjerciciosHilos\\resultados\\resultados" + sumaTotal + ".txt");
            try
            {
                FileWriter writer = new FileWriter(fichero);
                writer.write(String.valueOf(sumaTotal));
                writer.flush();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        if(Thread.currentThread().getName().equals("hilo 2"))
        {
            menor = 126;
            mayor = 250;
            for (int i = menor; i <= mayor ; i++)
            {
                sumaTotal += i;
            }
            System.out.println("Suma total es de " + sumaTotal);
            File fichero = new File("D:\\2ºGDAM\\PSP\\EjerciciosHilos\\resultados\\resultados" + sumaTotal + ".txt");
            try
            {
                FileWriter writer = new FileWriter(fichero);
                writer.write(String.valueOf(sumaTotal));
                writer.flush();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        if(Thread.currentThread().getName().equals("hilo 3"))
        {
            menor = 251;
            mayor = 375;
            for (int i = menor; i <= mayor ; i++)
            {
                sumaTotal += i;
            }
            System.out.println("Suma total es de " + sumaTotal);
            File fichero = new File("D:\\2ºGDAM\\PSP\\EjerciciosHilos\\resultados\\resultados" + sumaTotal + ".txt");
            try
            {
                FileWriter writer = new FileWriter(fichero);
                writer.write(String.valueOf(sumaTotal));
                writer.flush();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
        if(Thread.currentThread().getName().equals("hilo 4"))
        {
            menor = 376;
            mayor = 400;
            for (int i = menor; i <= mayor ; i++)
            {
                sumaTotal += i;
            }
            System.out.println("Suma total es de " + sumaTotal);
            File fichero = new File("D:\\2ºGDAM\\PSP\\EjerciciosHilos\\resultados\\resultados" + sumaTotal + ".txt");
            try
            {
                FileWriter writer = new FileWriter(fichero);
                writer.write(String.valueOf(sumaTotal));
                writer.flush();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }


    }

}
