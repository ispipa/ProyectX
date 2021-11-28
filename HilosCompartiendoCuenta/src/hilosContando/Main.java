package hilosContando;

public class Main
{

    public static void main(String[] args)
    {
        //constructor de cuenta para dar valor a los hilos (fijarse en HiloContador la clase)
        Cuenta cuentaComun = new Cuenta();
        HiloContador hilo1 = new HiloContador(cuentaComun);
        HiloContador hilo2 = new HiloContador(cuentaComun);
        HiloContador hilo3 = new HiloContador(cuentaComun);
        HiloContador hilo4 = new HiloContador(cuentaComun);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
