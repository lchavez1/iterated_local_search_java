import java.util.Random;

public  interface  Perturbation<State>{
    public State apply(State actual, Random random);
}

