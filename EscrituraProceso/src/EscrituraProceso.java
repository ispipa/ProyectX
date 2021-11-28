import java.io.*;

public class EscrituraProceso
{
    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DATE");

        Process p = pb.start();
        //--------------ESCRITURA-------------//
        //obtengo el outputstream para escribir en el proceso
        OutputStream oS = p.getOutputStream();

        //---------------Obtener lecturas del input del usuario---------------//
        System.out.println("Por favor escriba nueva fecha");
        InputStreamReader isR = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isR);
        String input = bf.readLine();

        oS.write(input.getBytes());
        oS.flush(); //simula el enter. Es la confirmacion de lo que se escribe

        //------------LECTURA DEL PROCESO------------//
        InputStream iS = p.getInputStream();
        isR = new InputStreamReader(iS);
        bf = new BufferedReader(isR);
        String mensaje = "";
        while((mensaje = bf.readLine()) != null)
        {
            System.out.println(mensaje);
        }
        oS.close();
        iS.close();
        isR.close();
        bf.close();
    }
}
