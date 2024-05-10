import Library.*;

public class Main {
            public static void main(String[] args) {

                System.out.println("Gestor de Biblioteca");

                // Crear un nuevo usuario
                Usuario user = new Usuario();

                // Crear un nuevo libro
                Libro libro = new Libro();

                // Crear un nuevo objeto de gestión de préstamo
                GestionPrestamo gestionPrestamo = new GestionPrestamo() {
                    @Override
                    public boolean realizarPrestamo() {
                        return true;
                    }

                    @Override
                    public boolean devolucion() {
                        return true;
                    }

                    @Override
                    public boolean verificarMulta() {
                        return false;
                    }
                };

                // El usuario solicita un libro
                String solicitarLibro = user.solicitarLibros();
                System.out.println("El estudiante ha solicitado el libro: " + solicitarLibro);//System.out.println(requestResult);

                // Realizar el préstamo del libro
                boolean realizarPrestamo = gestionPrestamo.realizarPrestamo();
                System.out.println(realizarPrestamo ? "El biblitoecario realizo el préstamo con éxito" : "Préstamo no realizado");

                // El usuario devuelve un libro
                boolean devolverLibros = user.devolverLibros();
                System.out.println(devolverLibros ? "El usuario ha devuelto el libro con éxito" : "El usuario no ha devuelto el libro");

                // Verificar si hay multa
                boolean fineResult = gestionPrestamo.verificarMulta();
                System.out.println(fineResult ? "Hay multa" : "No hay multa");
            }
        }