import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> list = loadDataFromUser(scanner);
        if (!list.isEmpty()) {
            printReversedNumberList(list);
            calculateAndPrintSum(list);
            printTheBiggestAndTheSmallestNumber(list);
        } else {
            System.out.println("lista jest pusta");
        }
    }

    private static void printTheBiggestAndTheSmallestNumber(List<Integer> list) {
        int theSmallestNumber = list.get(0);
        int theBiggestNumber = list.get(0);
        for (Integer integer : list) {
            if (integer > theBiggestNumber) {
                theBiggestNumber = integer;
            }
            if (integer < theSmallestNumber) {
                theSmallestNumber = integer;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + theSmallestNumber);
        System.out.println("Największa liczba w liście to " + theBiggestNumber);
    }

    private static void calculateAndPrintSum(List<Integer> list) {
        int addResult = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            addResult += integer;
            System.out.print(integer);
            if (i < list.size() - 1) {
                System.out.print(" + ");
            } else {
                System.out.println(" = " + addResult);
            }
        }
    }

    private static List<Integer> loadDataFromUser(Scanner scanner) {
        List<Integer> list = new LinkedList<>();
        boolean userInputIsPositive = true;
        while (userInputIsPositive) {
            System.out.println("Podaj liczbę");
            int i = scanner.nextInt();
            if (i < 0) {
                userInputIsPositive = false;
            } else {
                list.add(i);
            }
        }
        System.out.println();
        return list;
    }

    private static void printReversedNumberList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            Integer integer = list.get(i);
            System.out.print(integer);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

