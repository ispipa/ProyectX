import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class LanzarProceso
{
    //Lanzar la clase sacar mensaje como proceso
    public static void main(String[] args) throws IOException
    {
        //ProcessBuilder pb = new ProcessBuilder("java", "SacarMensaje");
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
        pb.directory(new File("D:\\AlexF\\PSP\\LecturaDeProceso\\out\\production\\LecturaDeProceso\\"));
                            //".\\out\\production\\LecturaDeProceso\\" el punto (.) indica el directorio raiz del proyecto
        //pb.start(); pb.start() se puede elegir la opción de añadir la excepción
        Process p = pb.start();
        InputStream iS = p.getInputStream();
        /*int c = iS.read(); //da a la c el valor del inputstream leyendolo
        System.out.println((char) c); //lee la primera letra y la imprime
        while(c != -1) //es porque solo hace el read siempre y cuando el valor sea distinto de -1
        {
            c = iS.read();
            System.out.println((char)c);//System.out.println(c);
        }*/
        int c;
        while((c = iS.read()) != -1)
        {
            System.out.print((char)c);//System.out.println(c); //es print y no println para que no lo escriba hacia abajo
        }
    }
}
