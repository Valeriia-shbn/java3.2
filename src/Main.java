public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilos = 98;
        double heightMeters = 1.87;
        int index = service.calculate(heightMeters, weightKilos);
        System.out.println(index);
    }
}