import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static String[] words = {"most","frequently", "asked", "java", "interview", "questions", "and", "with", "examples"};

    public static void main(String[] args) throws InterruptedException {

        System.out.println(3);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(2);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(1);
        TimeUnit.SECONDS.sleep(1);

        Random random = new Random();
        for(int i =0; i<10; i++) {
            System.out.print(words[random.nextInt(8)] + " ");
        }
        System.out.println();


        double start = LocalTime.now().toSecondOfDay();
        Scanner scanner = new Scanner(System.in);
        String typedWords = scanner.nextLine();
        double end = LocalTime.now().toSecondOfDay();

        double elapsedTime = end - start;

        int numChar = typedWords.length();

        int wpm = (int)(((double)(numChar / 5)) / elapsedTime) *60;

        System.out.println("Your wpm is " + wpm + "!");






    }
}