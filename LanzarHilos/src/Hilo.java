public class Hilo extends Thread //herencia, hereda de Thread
{
    //En el "run" defino el comportamiento de los hilos que voy a lanzar
    @Override
    public void run()
    {
        super.run();
        for (int i = 0; i < 10; i++)
        {
            System.out.println("El hilo " + currentThread().getName() + " va por: " + i);
        }
    }
}
