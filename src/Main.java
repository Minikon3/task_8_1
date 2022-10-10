import java.util.Scanner;

public class Main {
    static void task_1(int amount) {
        int k = 0;
        int j = 1;
        int result = 0;
        for (int i = 1; i <= amount; i++) {
            result += i;
        }
        for (int i = 0; i < result; i++) {
            System.out.print(j + " ");
            k++;
            if (j == k) {
                k = 0;
                j++;
            }
        }
    }
    static void task_2(int amount){
        for (int i=1; i<=amount; i++){
            if (i!= amount) {
                System.out.print(i + " ");
            }
            else System.out.println(i);
        }
    }
    static void task_3(int a, int b){
        if (a<b){
            for (int i=a; i<=b;i++)
                System.out.print(i+" ");
        }
        if (a>b){
            for (int i=a; i>=b; i--)
                System.out.print(i+" ");
        }
    }
    static int task_4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c;
        if (len==0)
            c=1;
        else
            c=0;
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += task_4(len + 1, sum + i, k, s);
        }
        return res;
    }
    static int task_5(int number) {
        if (number==0){
            return 0;
        }
        else
            return (number%10)+task_5(number/10);
    }
    static String task_6(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        if (n < 2) {
            return "NO";
        }
        else if (n == 2) {
            return "YES";
        }
        else if (n % i == 0) {
            return "NO";
        }
        else if (i < n / 2) {
            return task_6(n, i + 1);
        } else {
            return "YES";
        }
    }
    static void task_7(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        if (k > n / 2) {
            System.out.print(n + " ");
            return;
        }
        if (n % k == 0) {
            System.out.print(k + " ");
            task_7(n / k, k);
        }
        else {
            task_7(n, k+1);
        }
    }
    static String task_8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return task_8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    static int task_9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return task_9(a, b - 1) + task_9(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбор задания: ");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                System.out.println("Ввод числа ");
                int x = sc.nextInt();
                task_1(x);
                break;
            case 2:
                System.out.println("Ввод числа ");
                int y = sc.nextInt();
                task_2(y);
                break;
            case 3:
                System.out.println("Ввод чисел ");
                int int1 = sc.nextInt();
                int int2 = sc.nextInt();
                task_3(int1,int2);
                break;
            case 4:
                System.out.println("Введите число k ");
                int k = sc.nextInt();
                System.out.println("Введите число s ");
                int s = sc.nextInt();
                System.out.print("Результат: ");
                System.out.print(task_4(0,0,k,s));
                System.out.println();
                break;
            case 5:
                System.out.println("Ввод числа ");
                int z = sc.nextInt();
                System.out.println(task_5(z));
                break;
            case 6:
                System.out.println("Ввод числа ");
                int a1 = sc.nextInt();
                System.out.println(task_6(a1,2));
                break;
            case 7:
                System.out.println("Ввод числа ");
                int a2 = sc.nextInt();
                task_7(a2,2);
                break;
            case 8:
                System.out.println("Ввод строки ");
                String str1 = sc.next();
                System.out.println(task_8(str1));
                break;
            case 9:
                System.out.println("Ввод числа a");
                int q1=sc.nextInt();
                System.out.println("Ввод числа b");
                int q2= sc.nextInt();
                System.out.println(task_9(q1,q2));
        }
    }
}