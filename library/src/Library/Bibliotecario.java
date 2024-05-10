package Library;

public class Bibliotecario extends Persona{
    //Atributos

    //Relaciones
    private Persona persona;
    //Constructor

    //Metodos
    public boolean darLibros(){
        System.out.println("Dar libro");
        return true;
    }

    public boolean recibirLibros(){
        System.out.println("Recibir libro");
        return true;
    }
}