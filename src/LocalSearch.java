import java.util.ArrayList;
import java.util.Random;

public interface LocalSearch<State>{
    public State apply(State actual, Random random, Perturbation perturbation, ArrayList<Perturbation> ops, Accept accept);
}
