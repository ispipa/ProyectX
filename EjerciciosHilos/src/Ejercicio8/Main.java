package Ejercicio8;

import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        Thread hilo1 = new Thread(new LanzaSumas(args[0], args[1]));
        hilo1.setName("hilo 1");
        hilo1.start();
        Thread hilo2 = new Thread(new LanzaSumas(args[0] * 126, args[0] * 126 + 5));
        hilo2.setName("hilo 2");
        hilo2.start();
        Thread hilo3 = new Thread(new LanzaSumas(args[0] * 251, args[0] * 251 + 5));
        hilo3.setName("hilo 3");
        hilo3.start();
        Thread hilo4 = new Thread(new LanzaSumas());
        hilo4.setName("hilo 4");
        hilo4.start();
    }
}
