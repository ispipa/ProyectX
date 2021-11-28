package Ejercicio7;

public class Main
{
    public static void main(String[] args)
    {
        Thread hilo1 = new Thread(new Carrera());
        Thread hilo2 = new Thread(new Carrera());

        hilo1.setName("Liebre");
        hilo2.setName("Tortuga");

        hilo1.start();
        hilo2.start();
    }
}
