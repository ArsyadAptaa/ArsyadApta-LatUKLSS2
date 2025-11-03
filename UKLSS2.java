import java.util.Scanner;
public class UKLSS2 {
    static double volume(double r, double t) {
        return 3.14 * r * r * t;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jari-jari: ");
        double r = in.nextDouble();
        System.out.print("Tinggi: ");
        double t = in.nextDouble();
        System.out.println("Volume = " + volume(r, t));
        in.close();
    }
}
