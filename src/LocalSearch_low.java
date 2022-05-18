import java.util.Random;

public class LocalSearch_low implements LocalSearch<Solution>{

    static int maxIteration = 1000;

    @Override
    public Solution apply(Solution actual, Random random, Perturbation perturbation, Accept accept) {
        int i = 0;
        while(i < maxIteration){
            Solution sN = (Solution) perturbation.apply(actual, random);
            if(accept.apply(actual, sN)){
                actual = sN;
            }
            i++;
        }
        return actual;
    }

}
