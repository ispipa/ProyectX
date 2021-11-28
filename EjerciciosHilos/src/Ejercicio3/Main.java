package Ejercicio3;

public class Main
{
    public static void main(String[] args)
    {
        Thread caballo1 = new Thread(new Caballo(0));
        Thread caballo2 = new Thread(new Caballo(0));
        Thread caballo3 = new Thread(new Caballo(0));
        Thread caballo4 = new Thread(new Caballo(0));

        caballo1.setName("Perdigón");
        caballo2.setName("Rocinante");
        caballo3.setName("Bucéfalo");
        caballo4.setName("Sardinilla");

        caballo1.start();
        caballo2.start();
        caballo3.start();
        caballo4.start();


    }
}
