import java.io.*;

public class Ejercicio6Fer
{
    static FileReader reader;
    static BufferedReader bf;
    static FileWriter writer;
    static int res = 1;  //para guardar la variable numero

    public static void main(String[] args)
    {
        try
        {
            for (int i = 1; i <= 3; i++) {
                File ficheroEntrada = new File("entrada" + i + ".txt");
                reader = new FileReader(ficheroEntrada);
                bf = new BufferedReader(reader);
                String lineaLeida = bf.readLine();
                //no hay while porque se que todos los ficheros tienen una linea
                //Voy leyendo numeros de cada uno de los ficheros y voy multiplicandolos entre sí en "num"
                int num = Integer.parseInt(lineaLeida);
                res *= num;
            }
            writer = new FileWriter(new File("salida.txt"));
            writer.write(String.valueOf(res));
            writer.flush();


            reader.close();
            writer.close();
            bf.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
