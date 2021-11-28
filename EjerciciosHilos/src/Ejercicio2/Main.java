package Ejercicio2;

public class Main
{
    public static void main(String[] args)
    {
        Contador cont1 = new Contador(5, "hilo1", 40);
        Contador cont2 = new Contador(3, "hilo2", 30);
        cont1.start();
        cont2.start();
    }
}
