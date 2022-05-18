package low_level;

import high_level.Accept;
import high_level.Generic;
import low_level.double_solution.AcceptMax;
import low_level.double_solution.AcceptMin;
import low_level.double_solution.Mutation_low;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Double ini = 1.0;
        Mutation_low mutation_low = new Mutation_low();
        Random random = new Random();
        Accept<Double> doubleAcceptMax = new AcceptMax();
        Accept<Double> doubleAcceptMin = new AcceptMin();

        Generic<Double> algorithmDouble = new Generic<>(random, ini, mutation_low, doubleAcceptMax);
        Double res = algorithmDouble.apply(1000);
        System.out.println(res);

    }
}
