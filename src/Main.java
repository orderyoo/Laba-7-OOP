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

        Match zn1 = new Match(a, b, x);
        zn1.func1(x);
        zn1.func2(a, b);
        zn1.func3(a, b, x);
    }
}
class Match {
    double a, b, x;
    Match(double a, double b, double x){
        this.a = a;
        this.b = b;
        this.x = x;
    }
    public void func1(double x) {
        double rez = 3*x+5;
        System.out.println(rez);
    }
    public void  func2(double a, double b){
        if(a-b != 0) {
            double rez = (a+b)/(a-b);
            System.out.println(rez);
        } else {
            System.out.println("Ошибка, в знаменателе 0!");
        }
    }
    public void func3(double a, double b, double x){
        if (b != 0){
            double rez = a*x/b;
            double rez1 = rez - Math.floor(rez);
            if (rez1 == 0.0) {
                System.out.println(getFactorial(rez));
            } else {
                System.out.println("У нецелого числа нет факториала!");
            }
        } else {
            System.out.println("Ошибка, в знаменателе 0!");
        }
    }
    public int getFactorial(double y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * i;
        }
        return result;
    }
}
