import java.io.File;
import java.io.IOException;

public class RedireccionarStreams
{
    public static void main(String[] args)
    {
        ProcessBuilder pb = new ProcessBuilder("CMD");
        pb.redirectInput(new File("ejecutable.bat"));
        pb.redirectOutput(new File("salida.txt"));
        pb.redirectError(new File("error.txt"));
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
