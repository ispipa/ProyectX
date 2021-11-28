public class Persona extends Thread
{
   CuentaComun cuentaComun;
   String nombre;
    public Persona(String nombre, CuentaComun cuentaComun)
    {
        this.cuentaComun = cuentaComun;
        this.nombre = nombre;
    }

    @Override
    public void run()
    {
        super.run();
        //bloque critico: cuentaComun es compartida    synchronized (cuentaComun){   }

            for (int i = 0; i < 50; i++)
            {
                cuentaComun.retirarDinero(nombre, 10);
            }


    }
}
