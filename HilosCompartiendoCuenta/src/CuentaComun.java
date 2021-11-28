public class CuentaComun
{
    int cantidadInicial = 500;
    int cantidadActual = cantidadInicial;

    public CuentaComun(int cantidadInicial)
    {
        this.cantidadInicial = cantidadInicial;
    }
    synchronized void retirarDinero(String nombre, int cantidadRet)
    {
        if(cantidadActual > 0)
        {
            cantidadActual -= cantidadRet;
            System.out.println("El señor@ " + nombre + " retira " + cantidadRet + ".");
            System.out.println("La cuenta se quedo a: " + cantidadActual);
        }
        else
        {
            System.out.println("No te queda dinero.");
        }
    }
    void ingresarDinero(String nombre, int cantidadIng)
    {
        cantidadActual += cantidadIng;
        System.out.println(nombre + " ha ingresado " + cantidadIng);
        System.out.println("La cuenta se quedo a: " + cantidadActual);
    }
}
