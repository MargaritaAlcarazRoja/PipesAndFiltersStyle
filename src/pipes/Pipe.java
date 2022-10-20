package pipes;

/**
 * Conecta dos filtros ingresando el valor del filtro actual en el siguiente filtro.
 * @author Margarita Alcaraz
 * @param <I> El tipo de dato de entrada del filtro current
 * @param <O> El tipo de dato que se comunica entre ambos filtros
 * @param <P> El tipo de dato de salida del filtro next
 */
public class Pipe<I, O, P> implements Filter<I, P> {

    private Filter<I, O> current;
    private Filter<O, P> next;
    
    public Pipe(Filter<I, O> current, Filter<O, P> next){
        this.current = current;
        this.next = next;
    }
    
    @Override
    public P execute(I input) {
        return next.execute(current.execute(input));
    }
    
}
