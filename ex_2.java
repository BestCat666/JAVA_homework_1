//Вывести все простые числа от 1 до 1000
public class ex_2 {
    public static void main(String[] args) {
        int num = 1000;
        for (int i = 1; i <= num; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k = k + 1;
                }
            }
            if (k == 2) {
                System.out.println(i);
            }
        }
    }
}
