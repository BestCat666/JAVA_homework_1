//Вычислить n-ое треугольного число(сумма чисел от 1 до n).

public class ex_1 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
