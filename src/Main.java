import java.util.Random;

public class Main {

    static double start = -5;
    static double end = 5;

    public static void main(String[] args) {

        Perturbation_low perturbation_low = new Perturbation_low();

        Solution s0 = generateInitialSolution(2);
        System.out.println("Solucion inicial: \n" + s0 + "\n");

        Random random = new Random();
        Accept<Solution> solutionAcceptMin = new AcceptMinSolution();
        Accept<Solution> solutionAcceptMax = new AcceptMaxSolution();
        LocalSearch_low localSearch_low = new LocalSearch_low();

        GenericILS<Solution> algortithmSolution = new GenericILS<>(random, s0, perturbation_low, solutionAcceptMin, localSearch_low);
        Solution res = algortithmSolution.apply(1000);
        System.out.println(res);


        /*Double ini = 1.0;
        Mutation_low mutation_low = new Mutation_low();
        Random random = new Random();
        Accept<Double> doubleAcceptMax = new AcceptMax();
        Accept<Double> doubleAcceptMin = new AcceptMin();

        Generic<Double> algorithmDouble = new Generic<>(random, ini, mutation_low, doubleAcceptMax);
        Double res = algorithmDouble.apply(1000);
        System.out.println(res); */

    }

    public static Solution generateInitialSolution(int dim){
        Double[] sp = new Double[dim];
        for(int i = 0; i < dim; i++){
            double random = new Random().nextDouble();
            double result = start + (random * (end - start));
            sp[i] = result;
        }
        return new Solution(sp);
    }

}
