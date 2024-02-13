public class BmiService {
    public int calculate (double heightMeters, int weightKilos) {
        double index = weightKilos/heightMeters/heightMeters;
        return (int) index;

    }
}
