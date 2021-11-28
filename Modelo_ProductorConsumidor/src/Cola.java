import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cola
{

    //meto Integer porque tengo que meter un tipo clase y no un primitivo
    //las posiciones en el ArrayList funcionan al reves que en un Array.
    //en array: [0, 1, 2, 3]
    //en arrayList: [X..., 3, 2, 1, 0]
    //tambien podemos utilizar el metodo .sort()
    ArrayList<Integer> lista = new ArrayList<>();
    boolean disponible = false; //disponibilidad de los numeros
    //CONSUMIR numero de la lista
    synchronized Integer getNumber()  //era "void getNumber" pero como ponemos un return
      // para que nos devuelva un entero hacemos que el metodo sea Integer
    //Integer es un dato de salida. Pretende devolver un entero
    {
        while(!disponible) //mientras no haya numeros disponibles, esperar
        {   //!disponible es lo mismo que disponible == false
            try
            {
                wait(); //consumidor espera a que se genere numero
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        disponible = false;
        notify(); //consumidor notifica de que el numero ya ha sido consumido
        int numConsumido = lista.get(lista.size() -1);
        System.out.println("El consumidor consume " + numConsumido);
        //cojo numero de la lista
        //el tamaño de una lista va en size, no length
        //pongo -1 porque consumimos el ultimo numero de la lista
        return numConsumido;
    }

    //PRODUCIR numero de la lista
    synchronized void setNumber(Integer numNuevo) //Integer en el parametro de entrada porque se va a añadir el valor al arrayList
    {
        while(disponible)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        disponible = true;
        System.out.println("El productor produce " + numNuevo);
        notify();
        //añado un elemento al final de la lista
        lista.add(numNuevo); //este lo añade a la ultima posicion, basicamente los va apilando
        //lista.set(); //este lo añade a la posicion que digas: lista.set(2, 9) en la posicion 2 metes el 9
        //lista.sort();
        //lista.sort(Comparator.reverseOrder()); ORDENAR 6, 5, 4, 3,
        //lista.sort(Comparator.naturalOrder()); ORDENAR 3, 4, 5, 6,
    }

}
