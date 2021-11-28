package Ejercicio6;

import java.util.LinkedList;

public class Cola
{
    final int NUMEROS_MAXIMOS = 4;
    LinkedList<Integer> list;

    public Cola(LinkedList<Integer> list)
    {
        this.list = list;
    }

    boolean comprobarSiListaVacia()
    {
        boolean lV = list.isEmpty() ? true : false;
        return lV;
    }

    boolean comprobarSiListaLlena()
    {
        return list.size() == 4 ? true : false;
    }

    synchronized Integer get() throws InterruptedException
    {
        while(comprobarSiListaVacia())
        {
            wait();
        }
        Integer numSacado = list.removeLast();
        System.out.println("El consumidor " + Thread.currentThread().getName() + " consume " + numSacado);
        notifyAll();
        return numSacado;
    }

    synchronized void set(Integer numero) throws InterruptedException
    {
        while(comprobarSiListaLlena())
        {
            wait();
        }
        list.addFirst(numero);
        System.out.println("El productor " + Thread.currentThread().getName() + " ha producido el numero " + numero);
        notifyAll();
    }
}
