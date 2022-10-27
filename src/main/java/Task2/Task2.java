package Task2;

import org.springframework.scheduling.config.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] numbers = {100,90,88,76,56,42,38,22,10,4};
        Task2 task2 = new Task2();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number ");

        try {
            int userNumber = Integer.parseInt(bufferedReader.readLine());

            if (task2.search(numbers, userNumber)){
                System.out.println("The array contains a number.");
            }else {
                System.out.println("There is not a number in a array.");
            }

        } catch (IOException e) {
            System.out.println("You didn't enter a number.");
        }


    }

    private boolean search(int[] numbers, int x){
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, x);
        boolean foundKey = index > 0;

        return foundKey;
    }
}
