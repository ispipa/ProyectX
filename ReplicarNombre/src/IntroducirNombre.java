import java.io.*;
import java.util.Scanner;

public class IntroducirNombre
{
    public static void main(String[] args) throws IOException
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba nombre");
        String nombre = entrada.nextLine();
        System.out.println(nombre);

        ProcessBuilder pb = new ProcessBuilder("java", "ReplicarCadena", nombre);
        pb.directory(new File(".\\out\\production\\ReplicarNombre\\"));
        Process p = pb.start();
        InputStream iS = p.getInputStream();
        BufferedReader bf = new BufferedReader(new InputStreamReader(iS));
        System.out.println(bf.readLine());
    }
}
