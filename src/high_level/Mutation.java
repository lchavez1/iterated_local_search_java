package high_level;

import java.util.Random;

public interface Mutation<State> {

    public State apply(State actual, Random random);
}
