/**
 * створи массив з 10ел та запавни його данними.
 * вирахуй суму усіх ел.
 * знайди макс і мін ел.
 */
public class Ex_2 {
    public static void main(String[] args) {
        int A2[] = {7, 3, 5, 6, 22, 8, 0, 9, 2, 4};
        int suma = 0;
        for (int i = 0; i < 10; i++)
            suma = suma + A2[i];
        System.out.println("Suma = " + suma);
        int max = A2[0];
        int min = A2[0];
        for (int i = 0; i != 10; i++) {
            if (A2[i] > max) {
                max = A2[i];
            }
            if (A2[i] < min) {
                min = A2[i];
            }
        }
        System.out.println("Min = " + min + ";" + " Max =  " + max + ";");

    }
}
