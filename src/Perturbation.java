import java.util.Random;

public class Perturbation {

    static double start = -1;
    static double end = 1;

    public Solution apply(Solution s0){

        Double[] sp = new Double[s0.getS().length];
        for(int i = 0; i < s0.getS().length; i++){
            double random = new Random().nextDouble();
            double result = start + (random * (end - start));
            sp[i] = s0.getS()[i] + (result*s0.getS()[i]);
        }
        return new Solution(sp);
    }
    
}
