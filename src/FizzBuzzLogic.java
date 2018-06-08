import java.util.Random;

public class FizzBuzzLogic {

    static int currentWord = 0;

    public static void runFizzBuzz() {
        System.out.println("Welcome to \n" +
                " _____  ____  _____  _____      ____   __ __  _____  _____ \n" +
                "|     ||    ||     ||     |    |    \\ |  |  ||     ||     |\n" +
                "|   __| |  | |__/  ||__/  |    |  o  )|  |  ||__/  ||__/  |\n" +
                "|  |_   |  | |   __||   __|    |     ||  |  ||   __||   __|\n" +
                "|   _]  |  | |  /  ||  /  |    |  O  ||  :  ||  /  ||  /  |\n" +
                "|  |    |  | |     ||     |    |     ||     ||     ||     |\n" +
                "|__|   |____||_____||_____|    |_____| \\__,_||_____||_____|\n" +
                "                                                           ");
        System.out.println("A program that prints the numbers from 1 to 100. But for multiples of three it prints \u201cFizz\u201d " +
                "instead of the number and for the multiples of five print \u201cBuzz\u201d. For numbers which are multiples of both" +
                " three and five it prints \u201cFizzBuzz\u201d. This is the modified version, which chooses two random starting numbers" +
                " between 1 and 100. If these numbers are the same, it will print, \u201cShazam!!!\u201d");
        String output = "";
        output = fizzBuzz(output);
        System.out.println(output);
    }

    public static String fizzBuzz(String output){
        Random rand = new Random();
        int randomStartPoint1 = rand.nextInt(101);
        int randomStartPoint2 = rand.nextInt(101);
        int startPoint = smallerNumber(randomStartPoint1, randomStartPoint2);
        int endPoint = biggerNumber(randomStartPoint1, randomStartPoint2);
        System.out.println("Starting point: " + startPoint);
        System.out.println("Ending point: " + endPoint);
        int startEndDifference = randomStartPoint2 - randomStartPoint1;
        if (startEndDifference < 10){
            output += "This won't take long..\n";
        }
        if (randomStartPoint1 == randomStartPoint2){
            output += "Shazam!!!!\n";
        }
        for (int i = startPoint; i <= endPoint; i++){

            if (i % 15 == 0){
                output += "FizzBuzz!";
            } else if (i % 7 == 0) {
                output += i + " - multiple of seven.";
            } else if (i % 5 == 0) {
                output += "Buzz!";
            } else if (i % 3 == 0) {
                output += "Fizz!";
            } else {
                output += i;
            }
            if (i > 10){
                if (i % 2 == 0) {
                    output += " - " + rockPaper();
                }
            }

            output += "\n";
        }
        return output;
        }
    public static int biggerNumber(int first, int second){
        int biggerNumber = 0;
        if (first > second){
            biggerNumber = first;
        }
        if (second > first){
            biggerNumber = second;
        }
        return biggerNumber;
    }

    public static int smallerNumber(int first, int second){
        int smallerNumber = 0;
        if (first < second){
            smallerNumber = first;
        }
        if (second < first){
            smallerNumber = second;
        }
        return smallerNumber;
    }

    public static String rockPaper(){
        String lizardSpock[] = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
        String output = "";
        switch (currentWord){
            case 0:
                output += lizardSpock[currentWord];
                currentWord++;
                break;
            case 1:
                output += lizardSpock[currentWord];
                currentWord++;
                break;
            case 2:
                output += lizardSpock[currentWord];
                currentWord++;
                break;
            case 3:
                output += lizardSpock[currentWord];
                currentWord++;
                break;
            case 4:
                output += lizardSpock[currentWord];
                currentWord++;
                break;
        }
        if (currentWord > 4){
            currentWord = 0;
        }
        return output;
    }
}
