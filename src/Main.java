import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Задача 1");
        System.out.println("--------------------------------");
        System.out.println("Объявляем три массива: weight = {1, 2, 3}; width = {2, 3, 4, 5, 6, 7, 8}; numbers = {1.57, 7.654, 9.986};");
        System.out.println("--------------------------------");
        int[] weight = {1, 2, 3};
        int [] width = {2, 3, 4, 5, 6, 7, 8};
        double[] numbers = {1.57, 7.654, 9.986};

        System.out.println(" ");
        System.out.println("--------------------------------");

        System.out.println("Задача 2");
        System.out.println("--------------------------------");
        int i = 0;
        while (i <= weight.length - 1) {
            if (i < weight.length - 1) {
                System.out.print(weight[i] + ", ");
                i++;
            } else {
                System.out.print(weight[i]);
                i++;
            }
        }

        System.out.println(" ");

        int g = 0;
        while (g <= width.length - 1) {
            if (g < width.length - 1) {
                System.out.print(width[g] + ", ");
                g++;
            } else {
                System.out.print(width[g]);
                g++;
            }
        }
        System.out.println(" ");
        int d = 0;
        while (d <= numbers.length - 1) {
            if (d < numbers.length - 1) {
                System.out.print(numbers[d] + ", ");
                d++;
            } else {
                System.out.print(numbers[d]);
                d++;
            }
        }

        System.out.println("\n" + "--------------------------------");

        System.out.println(" ");

        System.out.println("Задача 3");
        System.out.println("--------------------------------");
        for (int b = weight.length - 1; b >= 0; b--) {
            if (b == 0) {
                System.out.println(weight[b]);
                break;
            }
            System.out.print(weight[b] + ", ");
        }

        for (int k = width.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.println(width[k]);
                break;
            }
            System.out.print(width[k] + ", ");
        }
        for (int s = numbers.length - 1; s >= 0; s--) {
            if (s == 0) {
                System.out.println(numbers[s]);
                break;
            }
            System.out.print(numbers[s] + ", ");
        }
        System.out.println("--------------------------------");

        System.out.println(" ");
        System.out.println("Задача 4");
        System.out.println("--------------------------------");
        int h = 2;
        int v = 0;
        int z = 0;
        while (z <= weight.length - 1) {
            v = h * weight[z];
            if (z == weight.length - 1) {
                System.out.print(v);
                z++;
                break;
            } else {
                System.out.print(v + ", ");
                z++;
            }
        }
        System.out.println(" ");
        System.out.println("--------------------------------");
    }
}






