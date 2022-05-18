public class AcceptMinSolution implements Accept<Solution>{
    @Override
    public boolean apply(Solution a, Solution b) {
        if(a.Rosenbrock() < b.Rosenbrock())
            return true;
        return false;
    }
}
