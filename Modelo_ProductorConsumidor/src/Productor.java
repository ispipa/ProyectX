import java.util.Random;

public class Productor extends Thread
{
    //si quiero crear un Productor nuevo lo hago a traves de algo que le de molde ( un constructor )
    //mas bien, sobre qué Cola quiero crearlo
    Cola colaComun;
    public Productor(Cola colaComun)
    {
        this.colaComun = colaComun;
    }

    @Override
    public void run()
    {
        super.run();
        for (int i = 0; i < 50; i++)
        {
            Random r = new Random();
            int numAle = r.nextInt(101);
            colaComun.setNumber(numAle);
        }
    }
}
