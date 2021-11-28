public class Consumidor extends Thread
{
    Cola colaComun;
    public Consumidor(Cola colaComun)
    {
        this.colaComun = colaComun;
    }

    @Override
    public void run()
    {
        super.run();
        for (int i = 0; i < 50; i++)
        {
           colaComun.getNumber();
        }
    }
}
