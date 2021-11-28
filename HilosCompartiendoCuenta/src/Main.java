public class Main
{
    public static void main(String[] args)
    {
        CuentaComun cuenta = new CuentaComun(500);
        Persona Salazar = new Persona("Salazar", cuenta);
        Persona Piter = new Persona("Piter", cuenta);
        Salazar.start();
        Piter.start();
    }
}
