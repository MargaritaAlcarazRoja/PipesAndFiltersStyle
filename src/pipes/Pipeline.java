package pipes;

/**
 * Una clase que se encarga de encadenar filtros y tuberias
 * @author Margarita Alcaraz
 * @param <I> El tipo de dato de entrada
 * @param <O> El tipo de dato de salida
 */
public class Pipeline<I, O> {
    
    private Filter<I, O> current;
    
    public Pipeline(Filter<I, O> curr){
        current = curr;
    }
    
    public <P> Pipeline<I, P> pipe(Filter<O, P> next){
        return new Pipeline<>(new Pipe<>(current, next));
    }
    
    public O process(I input){
        return current.execute(input);
    }
    
}
