import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        final int NUM_CONSUMIDORES  = 24;
        final int NUM_PRODUCTORES = 4;

        LinkedList<Integer> listComun = new LinkedList<>();

        Cola colaComun = new Cola(listComun);

        Thread[] productores = new Thread[NUM_PRODUCTORES];
        Thread[] consumidores = new Thread[NUM_CONSUMIDORES];

        for (int i = 0; i < NUM_PRODUCTORES; i++)
        {
            //doy valor a cada uno de los productores
            productores[i] = new Thread(new Productor(colaComun));
            productores[i].setName("Productor " + i);
            productores[i].start();
        }

        for (int i = 0; i < NUM_CONSUMIDORES; i++)
        {
            //doy valor a cada uno de los consumidores
            consumidores[i] = new Thread(new Consumidor(colaComun));
            consumidores[i].setName("Consumidor " + i);
            consumidores[i].start();
        }
    }
}
