import java.util.LinkedList;

public class Cola
{
    //esto es una constante: final + int + (variable mayusuclas ) + le doy valor
    final int NUMEROS_MAXIMOS = 10;
    LinkedList<Integer> list;
    //hago constructor de cola
    public Cola(LinkedList<Integer> list) //linkedlist es una implementacion de una lista doblemente enlazada
    //es decir, una lista tiene sus componentes con un metodo que referencia al siguiente y al anterior
    //esta lista funciona como una estructura  FIFO (first in first out )
    //FIFO:primero que introduces es el primero que sacas. SE UTILIZA EN LAS COLAS. SE SACA EL PRIMERO QUE ENTRA
    //LIFO:ultimo que introduces es el primero que sacas. SE UTILIZA EN LAS PILAS. SE SACA EL ULTIMO QUE ENTRA
    //pila de apilar, no pila de fuente de energia
    {
        this.list = list;
    }

    //boolean porque si es true hace una cosa, si es false otra
    boolean comprobarSiListaVacia()
    {
        /*if(list.isEmpty()) //si la lista esta vacia, true
        {
            return true;
        }
        else //sino, false
        {
            return false;
        }*/
        //al boolean se le da un valor dependiendo de si la condicion se cumple o no
        //estrucutra: boolean nombreVariable = condicion ? (<--si es verdad) true : (<--si no es verdad) false;
        /*
         * Ejemplo:
         * int daño = 50;
         * int vidas = daño > 70 ? 20 : 10; si el daño es mayor a 70, vidas es 20, sino vidas es 10
         * */
        /*boolean vF = list.isEmpty() ? true : false;
        return vF;*/
        //mas Facil:
        //return list.isEmpty() ? true : false;
        //aun mas facil:
        return list.isEmpty();
    }
    boolean comprobarSiListaLlena()
    {
        //si la lista tiene un tamaño 10, te devuelve true, sino false
        return list.size() == 10 ? true : false;
    }

    //la firma es get porque queremos numeros
    synchronized Integer get() throws InterruptedException
    {
        //mientras la lista esté vacia esperar
        while(comprobarSiListaVacia())
        {
            wait();
        }

        //se quita de la lista y muestra el ultimo elemento
        //para que los consumidores siempre saquen el ultimo elemento
        Integer numSacado = list.removeLast();
        System.out.println("El consumidor " + Thread.currentThread().getName() + " consume " + numSacado);
        //notificar a los productores para que sigan produciendo
        notifyAll();
        return numSacado;
    }

    //es como un set
    //es un metodo para que los productores siempre produzcan apilando numeros
    //metemos el synchronized porque habrán varios hilos
    synchronized void put(Integer numero) throws InterruptedException
    {
        //comprobar si esta llena
        //mientras la lista este llena
        while(comprobarSiListaLlena())
        {
            //asi con try-catch
            /*try
            {
                wait(); //esto es parte del modelo productor-consumidor
            } catch
            (InterruptedException e)
            {
                e.printStackTrace();
            }*/
            wait();
        }
        //se añade el primer elemento, el cual siempre va a ser el ultimo añadido
        //luego el ultimo de verdad es el primero que se añadió a la lista
        list.addFirst(numero);
        System.out.println("El productor " + Thread.currentThread().getName() + " ha producido el numero " + numero);

        //notificamos a los consumidores de que hay recurso disponible
        notifyAll();
    }
}
