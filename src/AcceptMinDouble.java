public class AcceptMinDouble implements Accept<Double> {

    @Override
    public boolean apply(Double a, Double b) {
        if (a < b)
            return true;
        return false;
    }
}
