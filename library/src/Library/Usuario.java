package Library;

public class Usuario extends Persona{
    //Atributos

    //Relaciones
    private Persona persona;
    //Constructor

    //Metodos
    public String solicitarLibros(){
        return "Libro infantil";
    }

    public boolean devolverLibros(){
        return true;
    }
}
