package high_level;

public interface Accept<State> {
    public boolean apply(State a, State b);
}
