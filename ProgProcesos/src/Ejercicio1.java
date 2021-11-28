public class Ejercicio1
{
    public static void main(String[] args)
    {

        if(args.length > 3)
        {
            System.out.println("No existen suficientes datos.");
        }else
        {
            System.out.println("Bienvenido " + args[0] + " " + args[1] + " " + args[2]);
        }
    }
}
