import java.io.*;

public class ReplicarCadena
{
    public static void main(String[] args)
    {
        //args[0]
        /*File ficheroSalida = new File("salida.txt");
        FileReader reader = null;
        BufferedReader bf = new BufferedReader(reader);
        //String lineaLeida = "";
        String argumentos = args[0];
        FileWriter writer = null;

        if(argumentos != null)
        {
            try
            {
                System.out.println(argumentos);
                writer = new FileWriter(ficheroSalida);
                int numLeido = Integer.parseInt(argumentos);
                for(numLeido = 0; numLeido < 6; numLeido++)
                {
                    writer.write(String.valueOf(numLeido * 2));
                }

            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        bf.close();
        reader.close();
        writer.close();*/
        if(args.length == 0)
        {
            System.out.println("no hay na");
            System.exit(1);
        }else
        {
            //System.out.println(args[0]);
            System.out.println("hjolaaaa");
            String nombreLeido = args[0];
            File file = new File("ficheroNombre.txt");
            try
            {
                FileWriter writer = new FileWriter(file);
                for (int i = 0; i < 5; i++)
                {
                    writer.write(nombreLeido);
                }
                writer.flush();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
