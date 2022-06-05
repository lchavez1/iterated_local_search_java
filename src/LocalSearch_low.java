import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class LocalSearch_low implements LocalSearch<Solution>{

    public HashMap<Integer, Integer> hits = new HashMap<>();

    static int maxIteration = 1000;

    @Override
    public Solution apply(Solution actual, Random random, Perturbation perturbation, ArrayList<Perturbation> ops, Accept accept) {

        int i = 0;

        for(int x = 0; x < ops.size(); x++){
            if(hits.containsKey(x)){
                hits.put(x, 0);
            }
        }

        while(i < maxIteration){
            int index = random.nextInt(ops.size());
            //Solution sN = (Solution) perturbation.apply(actual, random);
            Solution sN = (Solution) ops.get(index).apply(actual, random);
            if(accept.apply(actual, sN)){
                actual = sN;
                if(hits.containsKey(index)){
                    hits.put(index, hits.get(index) + 1);
                } else {
                    hits.put(index, 1);
                }
            }
            i++;
        }
        System.out.println(hits + " nIter = " + i);
        return actual;
    }

}
