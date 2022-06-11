import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class LocalSearch_low implements LocalSearch<Solution>{

    private int w;

    public LocalSearch_low(int w){
        this.w = w;
    }

    public HashMap<Integer, Integer> hits = new HashMap<>();
    public HashMap<Integer, Float> probability_hits = new HashMap<>();

    static int maxIteration = 1000;

    @Override
    public Solution apply(Solution actual, Random random, Perturbation perturbation, ArrayList<Perturbation> ops, Accept accept) {

        int i = 0;

        for(int x = 0; x < ops.size(); x++){
            if(hits.containsKey(x)){
                hits.put(x, 0);
            }
        }

        int index = 0;
        double value = 0;
        int exitos = 0;
        while(i < maxIteration){
            if(i < this.w){
                index = random.nextInt(ops.size());
            } else if(i == w){
                for(int j = 0; j < hits.size(); j++){
                    probability_hits.put(index, Float.valueOf(hits.get(j))/exitos);
                }
                index = random.nextInt(ops.size());
            } else {
                double sum = 0;
                for(int k = 0; k < probability_hits.size(); k++){
                    if(probability_hits.get(k) != null){
                        sum += probability_hits.get(k);
                        double val = random.nextDouble();
                        if(val <= sum){
                            index = k;
                        }
                    } else {
                        index = random.nextInt(ops.size());
                    }
                }
            }
            Solution sN = (Solution) ops.get(index).apply(actual, random);
            if(accept.apply(actual, sN)){
                actual = sN;
                if(hits.containsKey(index)){
                    hits.put(index, hits.get(index) + 1);
                } else {
                    hits.put(index, 1);
                }
                exitos++;
            }
            i++;
        }
        System.out.println(hits + " total exitos = " + exitos);
        return actual;
    }

}
