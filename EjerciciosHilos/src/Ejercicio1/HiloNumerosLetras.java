package Ejercicio1;

public class HiloNumerosLetras implements Runnable
{

    @Override
    public void run()
    {
        if(Thread.currentThread().getName().equals("hilo_1"))
        {
            for (int i = 1; i <= 30; i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            char[] alpha = new char[26];
            for(int i = 0; i < 26; i++)
            {
                alpha[i] = (char)(97 + i);
                System.out.println(alpha[i]);
            }
        }

        //System.out.println("El hilo va por " + Thread.currentThread().getName());
    }
}
