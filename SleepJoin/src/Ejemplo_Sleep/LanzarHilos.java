package Ejemplo_Sleep;

public class LanzarHilos
{
    public static void main(String[] args)
    {
        Thread hilo1 = new Thread(new Hilo());
        Thread hilo2 = new Thread(new Hilo());
        hilo1.start();
        hilo2.start();
    }
}
