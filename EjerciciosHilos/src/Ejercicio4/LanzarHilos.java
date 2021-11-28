package Ejercicio4;

public class LanzarHilos
{
    public static void main(String[] args)
    {
        Thread hilo1 = new Thread(new Hilos());
        Thread hilo2 = new Thread(new Hilos());
        Thread hilo3 = new Thread(new Hilos());
        Thread hilo4 = new Thread(new Hilos());
        Thread hilo5 = new Thread(new Hilos());

        hilo1.setName("hilo 1");
        hilo2.setName("hilo 2");
        hilo2.setName("hilo 3");
        hilo2.setName("hilo 4");
        hilo2.setName("hilo 5");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }
}
