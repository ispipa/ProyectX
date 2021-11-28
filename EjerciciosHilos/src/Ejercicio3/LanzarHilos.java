package Ejercicio3;

public class LanzarHilos
{
    public static void main(String[] args)
    {
        Hilos hilo1 = new Hilos();
        Hilos hilo2 = new Hilos();
        Hilos hilo3 = new Hilos();
        Hilos hilo4 = new Hilos();

        hilo1.setName("Hilo 1");
        hilo2.setName("Hilo 2");
        hilo3.setName("Hilo 3");
        hilo4.setName("Hilo 4");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
