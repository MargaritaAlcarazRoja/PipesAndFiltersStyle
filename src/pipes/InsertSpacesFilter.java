package pipes;

/**
 *
 * @author Margarita Alcaraz
 */
public class InsertSpacesFilter implements Filter<String, String> {
    
    @Override
    public String execute(String input) {
        String res = "";
        for(char x : input.toCharArray()){
            res += x + " ";
        }
        return res;
    }
    
}
