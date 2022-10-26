import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Lesson2_Ex2 {
    public static void main(String[] args) {

        double a, b,c, x;
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();
        String s = (a == 0) ? "Phương trình vô nghiệm" : "Phương trình có 2 nghiệm";
        System.out.println(s);
        double d = (b * b) - 4 * a * c; // d la delta
        double x1 = ((-b) + Math.sqrt(d)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(d)) / (2 * a);
        System.out.println("Gia tri cua nghiem thu nhat la " + x1);
        System.out.println("Gia tri cua nghiem thu hai la " + x2);
    }
}
