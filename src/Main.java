import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = scan.nextDouble();
        System.out.print("Введите b: ");
        double b = scan.nextDouble();
        System.out.print("Введите х: ");
        double x = scan.nextDouble();

        Match.func1(x);
        Match.func2(a, b);
        Match.func3(a, b, x);
    }
}
class Match {
    double a, b, x;
    Match(double a, double b, double x){
        this.a = a;
        this.b = b;
        this.x = x;
    }
    public static void func1(double x) {
        double rez = 3*x+5;
        System.out.println(rez);
    }
    public static void  func2(double a, double b){
        if(a-b != 0) {
            double rez = (a+b)/(a-b);
            System.out.println(rez);
        } else {
            System.out.println("Ошибка, в знаменателе 0!");
        }
    }
    public static void func3(double a, double b, double x){
        if (b != 0){
            double y = a*x/b;
            System.out.println(y);
        } else {
            System.out.println("Ошибка, в знаменателе 0!");
        }
    }
}
