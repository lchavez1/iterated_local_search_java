import java.util.Arrays;

public class Solution {

    private Double[] s;
    private Double fitness;

    public Solution(Double[] s) {
        this.s = s;
        this.fitness = Rosenbrock();
    }

    public Double Rosenbrock(){
        return 100*Math.pow(s[1]-(Math.pow(s[0], 2)), 2) - (1-Math.pow(s[0], 2));
    }

    public Double[] getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Solution{" +
                " array= " + Arrays.toString(this.s) +
                " fitness= " + this.fitness +
                " }";
    }
}
