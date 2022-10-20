package pipesandfiltersstyle;

import pipes.PipelineManager;

/**
 *
 * @author Margarita Alcaraz
 */
public class PipesAndFiltersStyle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PipelineManager m = new PipelineManager();
        String input = "Margarita Alcaraz Rojas";
        String output = m.process(input);
        System.out.println(output);
        
    }
    
}
