package pipes;

/**
 * Un filtro que duplica una cadena de caracteres
 * @author Margarita Alcaraz
 */
public class RepeatFilter implements Filter<String, String> {

    @Override
    public String execute(String input) {
        return input.concat(input);
    }
    
}
