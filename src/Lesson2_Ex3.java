import java.util.Scanner;
public class Lesson2_Ex3 {
    public static void main(String[] args) {
        int a,b, c, s;
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt(); // a là chiều dài
        System.out.print("b = ");
        b = input.nextInt(); // b là chiều dài
        c = (a+b)*2;
        s = a*b;
        System.out.println("Chu vi hinh chu nhat la "+c);
        System.out.println("Dien tich hinh chu nhat la "+s);

    }

}
