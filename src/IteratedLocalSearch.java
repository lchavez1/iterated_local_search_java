

public class IteratedLocalSearch {

   /* static double start = -5;
    static double end = 5;
    static int maxIteration = 2000;

    static Perturbation perturbation = new Perturbation();

    public static void main(String[] args) {
        int i = 0;
        Solution s0 = generateInitialSolution(2);
        System.out.println("Solucion inicial: \n" + s0 + "\n");
        Solution sA = localSearch(s0);
        Solution s1 = null;
        while(i < maxIteration){
            s1 = perturbation.apply(sA);
            Solution sA1 = localSearch(s1);
            if(sA1.Rosenbrock() < s1.Rosenbrock())
                s1 = sA1;
            if(i == 100 || i == 500 || i == 1000)
                System.out.println(s1);
            i++;
        }
        System.out.println("\nSolucion despues de ILS: \n" + s1);
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

    public static Solution localSearch(Solution s0){
        int i = 0;
        while(i < maxIteration){
            Solution sN = perturbation.apply(s0);
            if(sN.Rosenbrock() > s0.Rosenbrock())
                s0 = sN;
            i++;
        }
        return s0;
    }*/
}
