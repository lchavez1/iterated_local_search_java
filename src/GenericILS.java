import java.util.ArrayList;
import java.util.Random;

public class GenericILS<State> {

    private Random random;
    private State actual;
    private Perturbation<State> op;
    private ArrayList<Perturbation> ops;
    private Accept<State> aceptation;
    private LocalSearch<State> localSearch;

    public GenericILS(Random random, State actual, Perturbation<State> op, ArrayList<Perturbation> ops, Accept<State> aceptation, LocalSearch<State> localSearch) {
        this.random = random;
        this.actual = actual;
        this.op = op;
        this.ops = ops;
        this.aceptation = aceptation;
        this.localSearch = localSearch;
    }

    public State apply(int maxIter){
        System.out.println(actual);
        int i = 0;

         State sA = localSearch.apply(actual, random, op, ops, aceptation);

        State s1 = null;
        while(i < maxIter){
            s1 = op.apply(sA, random);
            State sA1 = localSearch.apply(s1, random, op, ops, aceptation);
            if(aceptation.apply(sA1, s1)){
                s1 = sA1;
            }
            i++;
        }
        System.out.println("\nSolucion despues de ILS: \n" + s1);
        return s1;
    }
}
