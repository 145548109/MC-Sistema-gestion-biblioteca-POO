package Library;

public class Prestamo extends Gestion{
    //Atributos
    private boolean sePresto;
    private boolean seDevolvio;
    //Relaciones
    private Gestion gestion;
    //Constructor

    //Metodos
    public void prestar(String material){
        System.out.println("Prestar material");
    }

    public void devolver(String material){
        System.out.println("Devolver material");
    }
}
