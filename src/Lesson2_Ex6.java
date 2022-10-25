import java.util.Scanner;
public class Lesson2_Ex6 {
    public static void main(String[] args) {
        double pi=3.24;
        double r,c,s;
        /*
        * r là bán kính đường tròn
        * c là chu vi đường tròn
        * s là diện tích hình tròn*/

        Scanner input = new Scanner(System.in);
        System.out.print("r =");
        r = input.nextDouble();
        c = 2 * pi * r;
        s = pi * r * r;
        System.out.println("Chu vi duong tron la "+c);
        System.out.println("Dien tich hinh tron la "+s);
    }
}
