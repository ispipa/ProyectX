package Ejercicio1;

public class LanzarHilos
{

    public static void main(String[] args)
    {
        Thread hilo1 = new Thread(new HiloNumerosLetras());
        hilo1.setName("hilo_1");
        hilo1.start();
        Thread hilo2 = new Thread(new HiloNumerosLetras());
        hilo2.setName("hilo2");
        hilo2.start();
    }
}
