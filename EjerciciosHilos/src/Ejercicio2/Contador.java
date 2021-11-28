package Ejercicio2;

public class Contador extends Thread
{
    int cont;
    String nombreHilo;
    int limCont;

    public Contador(int cont, String nombreHilo, int limCont)
    {
        this.cont = cont;
        this.nombreHilo = nombreHilo;
        this.limCont = limCont;
    }

    @Override
    public void run()
    {
        super.run();
        if(nombreHilo.equals("hilo1"))
        {
            for (int i = cont; i < limCont; i++)
            {
                System.out.println("El hilo " + nombreHilo + " va por " + i);
            }
        }
    }
}
