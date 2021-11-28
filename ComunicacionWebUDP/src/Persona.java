import java.io.Serializable;

public class Persona implements Serializable
{
    String nombre;
    int edad;
    int contraseña;

    public Persona(String nombre, int edad, int contraseña)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.contraseña = contraseña;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getContraseña()
    {
        return contraseña;
    }

    public void setContraseña(int contraseña)
    {
        this.contraseña = contraseña;
    }
}
