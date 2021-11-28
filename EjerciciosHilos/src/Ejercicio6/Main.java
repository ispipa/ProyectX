package Ejercicio6;

import javax.print.attribute.IntegerSyntax;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> listComun = new LinkedList<>();
        Cola colaComun = new Cola(listComun);

        Productor productor = new Productor(colaComun);
        Consumidor consumidor = new Consumidor(colaComun);
    }
}
