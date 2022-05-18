import java.util.Random;

public class Generic<State> {
    private Random random;
    private State actual;
    private Mutation<State> op;
    private Accept<State> aceptation;

    public Generic(Random random, State actual, Mutation<State> op, Accept<State> aceptation) {
        this.random = random;
        this.actual = actual;
        this.op = op;
        this.aceptation = aceptation;
    }

    public State apply(int nIter){
        for(int i = 0; i < nIter; i++){
            State temp = op.apply(actual, random);
            if(aceptation.apply(temp, actual)){
                actual = temp;
                System.out.println(actual);
            }
        }
        return actual;
    }
}
