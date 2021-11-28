package Ejercicio7;

import java.util.Random;

public class Carrera implements Runnable
{

    Random rnd = new Random();
    static int finish = 0;
    @Override
    public void run()
    {
        System.out.println("AAAARRANCA EL GRAN PREMIO DE ESPAÑA AHORA MISMO ");
        System.out.println("LIEBRE DEFIENDE LA POLE, TORTUGA A POR TODAS");
        System.out.println("Y UNA SALIDA EN LA QUE OCURRE ESTO");
        liebre();
        tortuga();
        comprobarFinish();
    }

    synchronized void liebre()
    {
        if(Thread.currentThread().getName().equals("Liebre"))
        {
            for (int i = 0; i <= 70;)
            {
                int probabilidadRND = rnd.nextInt((11) - 1);

                switch(probabilidadRND)
                {
                    case 0:
                    case 1:
                        i += 0;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        i += 1;
                        break;
                    case 5:
                    case 6:
                        i += 9;
                        break;
                    case 7:
                    case 8:
                        i -= 2;
                        break;
                    case 9:
                        i-= 12;
                        break;

                }
                if (i < 0)
                {
                    i = 0;
                }
                System.out.println(probabilidadRND + " ale");
                System.out.println(i);
                System.out.println("****LIEBRE****");
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            finish = finish + 1;  //si uno acaba antes que el otro el finish se le suma 1 de manera global y el siguiente finish ya tendrá valor 2
            System.out.println("LIEBRE HA FINALIZADO LA CARRERA");
        }
        notifyAll();
    }

    private synchronized void tortuga()
    {
        if(Thread.currentThread().getName().equals("Tortuga"))
        {
            for (int i = 0; i <= 70;)
            {
                int probabilidadTort = rnd.nextInt((11) - 1);
                switch (probabilidadTort)
                {
                    case 0:
                    case 1:
                    case 2:
                        i += 1;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        i += 3;
                        break;
                    case 8:
                    case 9:
                        i -= 6;
                        break;
                }
                if (i < 0)
                {
                    i = 0;
                }
                System.out.println(probabilidadTort + " ale");
                System.out.println(i);
                System.out.println("****TORTUGA****");
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            finish = finish + 1;
            System.out.println("TORTUGA HA FINALIZADO LA CARRERA");
        }
        notifyAll();
    }

    private void comprobarFinish()
    {
        if(finish == 1)
        {
            System.out.println(Thread.currentThread().getName() + " HA GANADO ESTE GRAN PREMIO " + finish);
        }
        else if(finish == 2)
        {
            System.out.println(Thread.currentThread().getName() + " HA QUEDADO EN SEGUNDO LUGAR " + finish);
        }
        else
        {
            System.out.println("TEEENEMOS UN EMPATE SEÑORAS Y SEÑORES");
        }
    }
}
