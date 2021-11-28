package hilosContando;

public class HiloContador extends Thread
{
    Cuenta cuentaComun;//a esta se le dara valor por el parametro del constructor
    public HiloContador (Cuenta cuentaComun)
    {
        this.cuentaComun = cuentaComun;
    }
    //Describo el comportamiento de los hilos
    @Override
    public void run()
    {
        super.run();
        //region critica
        synchronized (cuentaComun)
        {
            //los dos hilos pretenden incrementar la cuenta comun 500 veces
            //al ir a la par habra inconsistencias
            for (int i = 0; i < 500; i++)
            {
                System.out.println("Cuenta el hilo " + currentThread().getName());
                cuentaComun.incrementarCuenta(); //incrementarCuenta aparece en la clase Cuenta
            }
        }


    }
}
