public interface NPC
{
    //Cómo se le define
    int vidas = 100;
    String nombre = "";
    float velocidad = 5.5f;

    //Qué hace un NPC
    void mover();  //los metodos no pueden tener cuerpo en las interfaces. Se deja en ";"
    void hablar();
    void repetirComportamiento();
}
