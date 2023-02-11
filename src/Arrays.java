public class Arrays {
    public static void main(String[] args) {
        double[] data = new double[5];
        data[0] = 10.50;
        data[1] = 20.20;
        data[2] = 30.40;
        data[3] = 70.90;
        data[4] = 40.20;

        for (double datum : data) {
            System.out.println(datum + " ");
        }

        System.out.println();
        System.out.println("======");
        System.out.println(" ");

        System.out.println(java.util.Arrays.toString(data));
    }
}
