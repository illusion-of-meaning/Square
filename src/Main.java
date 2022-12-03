import Exceptions.MaxValueException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число для возведения в квадрат: ");
        try {
            int number = Integer.valueOf(reader.readLine());
            if (number > 30000) {
                throw new MaxValueException("Максимальное значение для вводимого числа = '30000'");
            }
            System.out.println(square(number));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static int square(int i) {
        return i * i;
    }
}