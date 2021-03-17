
public class AsterisksFigures {
    public static void main(String[] args) {

        //прямоугольник
        int height = 8;
        int width = 8;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //пустой прямоугольник
        int a = 5;
        int b = 8;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j == 0 || i == 4 || i == 0 || j == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            System.out.println();
            System.out.println();

            //прямоугольный треугольник
        for (int i = 7; i >= 0; i--) {
            for (int j = i; j < 7; j++) {
                System.out.print("*");
                }
            System.out.println();
            }
        System.out.println();
        System.out.println();

            //равнобедренный треугольник
        int k = 0;
        for (int i = 1; i <= 5; i++) {  //нельзя ставить i = 0, потому что получим бесконечное выполнение цикла
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            while (k != i*2-1) {
                System.out.print("*");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}