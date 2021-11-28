public class LanzarHilosConRunnable
{
    public static void main(String[] args)
    {
        //Cuando funcionamos con runnable tenemos que generar instancia de tipo Thread, pasando por parametro un tipo runnable
        Thread hilo1 = new Thread(new HiloConRunnable());
        hilo1.start();
        Thread hilo2 = new Thread(new HiloConRunnable());
        hilo2.start();
    }
}
