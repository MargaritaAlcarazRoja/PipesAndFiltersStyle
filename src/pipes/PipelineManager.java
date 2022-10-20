package pipes;

/**
 * Una clase que ayuda a la creación de pipelines
 * @author Margarita Alcaraz
 */
public class PipelineManager {
    
    public String process(String input){
        Pipeline<String, String> pipeline = new Pipeline<>(new UppercaseFilter())
                .pipe(new RepeatFilter())
                .pipe(new InsertSpacesFilter());
        return pipeline.process(input);
    }
    
}
