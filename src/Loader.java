import java.util.Scanner;

public class Loader {


    public static void main(String[] args) {
        int trackCapacity = 2;
        int containerCapacity = 27;


        Scanner scanner = new Scanner(System.in);

        int boxesNumber = scanner.nextInt();
        long containersNumber = (int) (boxesNumber / ((float) containerCapacity) + 0.5);
        long tracksNumber = (int) (containersNumber / ((float) trackCapacity) + 0.5);

        int numberOfBox = 0;
        int numberOfContainer = 0;
        for (int i = 0; i < tracksNumber; i++) {
            System.out.println("Грузовик " + (i + 1) + ":");
            int c = Math.min((int) (containersNumber - numberOfContainer), trackCapacity);
            for (int a = 0; a < c; a++) {
                System.out.println("\tКонтейнер " + ++numberOfContainer + ":");
                int o = Math.min(boxesNumber - numberOfBox, containerCapacity);
                for (int j = 0; j < o; j++) {
                    System.out.println("\t\tЯщик " + ++numberOfBox);
                }
            }
        }
    }
}
