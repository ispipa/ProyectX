public class Main
{


    public static void main(String[] args)
    {
        Cola colaComun = new Cola(); //lo dejo vacio porque en Cola no hay ningun constructor
        Productor productor = new Productor(colaComun);
        Consumidor consumidor = new Consumidor(colaComun);

        //Arranco los dos hilos
        productor.start();
        consumidor.start();
    }
}
