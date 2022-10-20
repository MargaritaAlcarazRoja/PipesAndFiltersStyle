package pipes;

/**
 * Un filtro que convierte una cadena de caracteres a mayusculas
 * @author Margarita Alcaraz
 */
public class UppercaseFilter implements Filter<String, String> {

    @Override
    public String execute(String input) {
        return input.toUpperCase();
    }
    
}
