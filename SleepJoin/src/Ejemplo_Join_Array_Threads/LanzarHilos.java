package Ejemplo_Join_Array_Threads;

public class LanzarHilos
{
    static Thread[] hilosLanzados = new Thread[2];
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < hilosLanzados.length; i++)
        {
            hilosLanzados[i] = new Thread(new Hilo());
            hilosLanzados[i].start();
        }
        for (int i = 0; i < hilosLanzados.length; i++)
        {
                hilosLanzados[i].join();
            System.out.println("El hilo " + hilosLanzados[i].getName() + " ha finalizado." );
        }
    }
}
