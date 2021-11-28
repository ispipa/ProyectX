import java.io.*;

public class LecturaYEscritura
{
    public static void main(String[] args)
    {
        File ficheroEntrada = new File("entrada.txt");
        try
        {
            //----------LECTURA-------------------------//
            FileReader reader = new FileReader(ficheroEntrada);
            BufferedReader bf = new BufferedReader(reader);
            String lineaLeida = "";
            FileWriter writer = null;
            while((lineaLeida = bf.readLine()) != null)
            {
                System.out.print(lineaLeida);
                //----------------ESCRITURA--------------//
                File salida = new File("salida.txt");
                writer = new FileWriter(salida);
                /*como quiero operar con el numero leido,
                 necesito primero pasarlo a entero*/
                int numLeido = Integer.parseInt(lineaLeida);  //el String que hay lo pasa a entero
                /*como queremos escribir el doble del numero
                en el nuevo fichero, despues de operar (numLeido*2)
                debemos pasar de nuevo ese numero a formato string
                con el metodo String.valueof()*/
                writer.write(String.valueOf(numLeido * 2));
                //String.valueOf();  metes un entero y te lo devuelve en string

            }
            bf.close();
            reader.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
