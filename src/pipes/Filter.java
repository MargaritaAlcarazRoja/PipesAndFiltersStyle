package pipes;

/**
 * Interface base para todos los filtros
 * @author Margarita Alcaraz
 * @param <I> El tipo de dato de entrada
 * @param <O> El tipo de dato de salida
 */
public interface Filter<I, O> {
    
    public O execute(I input);
    
}
