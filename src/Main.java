/* Вычислить сумму sqrt(1 + sqrt(2 + sqrt(3 + ... sqrt(50))) */

public class Main {
    /*  Число дано */
    final static int N = 5;

    public static void main(String[] args) {
        System.out.println("getResult(1): " + getResult(1));
    }

    /*  Я проверил в экселе N = 5, сходится
        Рекурсивная функция -- начинаем с n и поднимаемся до N где возвращаем последний корень
    */
    static double getResult(int n) {
        if (n == N) {
            return Math.sqrt(N);
        } else {
            return Math.sqrt(n + getResult(n + 1));
        }
    }
}