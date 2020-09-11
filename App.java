import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Main main = new Main();
    }
//1
    public void f1() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int count = 0;
        int number = 0;
        for (int i = 0; i < 10; i++) {

            if ((number = scanner.nextInt()) > 10) {
                result += number;
                count++;
            }
        }
        System.out.println(result / count);
        scanner.close();
    }
//2
    public void f2() {
        int r = 5;
        for (int i = 0; i < 12; i++) {
            r += 5;
        }

        System.out.println(((4 * Math.PI * Math.pow(r, 3)) / 3) / 1000);
    }
//3
    public void f3() {
        int sum = 0;
        int temp = 1;
        for (int i = 2; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                temp *= j;
            }
            sum += temp;
            temp = 0;
        }
        System.out.println(sum);
    }
//4
    public void f4() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = scanner.nextInt(); ; i++) {
            if (i % 19 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 15) {
                break;
            }
        }
        scanner.close();
    }
//5
    public void f5() {
        Scanner scanner = new Scanner(System.in);
        //(a > b)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 0) {
            System.out.println(0);
        }

        if (b == 0) {
            System.out.println(0);
        }
        int count = 0;
        while (a > 0) {
            count++;
            a -= b;
        }
        System.out.println("/ " + (a < 0 ? count - 1 : count));
        System.out.println("% " + (a < 0 ? a + b : 0));
        scanner.close();
    }
//6
    public void f6() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int number;
            if ((number = scanner.nextInt()) % n == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
