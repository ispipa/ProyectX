public class LanzarHilos
{
    public static void main(String[] args)
    {
        //Genero los dos hilos.
        for (int i = 0; i < 10; i++)
        {
            Hilo hiloNuevo = new Hilo();
            //set name nos vale para establecer el nombre que queramos a un hilo
            hiloNuevo.setName("Hilo " + i);
            //setPriority establece prioridad de ejecucion
            //no tiene por que cumplirse
            hiloNuevo.setPriority(i + 1);
            //Como heredan de la clase "Thread", traen consigo el metodo start() para iniciar el run()
            hiloNuevo.start();
        }
        ejemplo();
    }

    static void ejemplo()
    {

    }
}
