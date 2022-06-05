import java.util.Random;

public class Perturbation_med implements Perturbation<Solution>{

    static double start = -0.1;
    static double end = 0.1;

    @Override
    public Solution apply(Solution actual, Random random) {
        Double[] sp = new Double[actual.getS().length];
        for(int i = 0; i < actual.getS().length; i++){
            double result = start + (random.nextDouble() * (end - start));
            sp[i] = actual.getS()[i] + (result*actual.getS()[i]);
        }
        return new Solution(sp);
    }
}
