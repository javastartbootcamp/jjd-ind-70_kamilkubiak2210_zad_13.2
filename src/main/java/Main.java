import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> list = new LinkedList<>();

        loadDataFromUser(scanner, list);
        printReversedNumberList(list);
        calculateAndPrintSum(list);
        printTheBiggestAndTheSmallestNumber(list);
    }

    private static void printTheBiggestAndTheSmallestNumber(List<Integer> list) {
        if (!list.isEmpty()) {
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
        } else {
            System.out.println("Lista jest pusta");
        }
    }

    private static void calculateAndPrintSum(List<Integer> list) {
        if (!list.isEmpty()) {
            int addResult = 0;
            for (int i1 = 0; i1 < list.size(); i1++) {
                Integer integer = list.get(i1);
                addResult += integer;
                System.out.print(integer);
                if (i1 < list.size() - 1) {
                    System.out.print(" + ");
                } else if (i1 == list.size() - 1) {
                    System.out.println(" = " + addResult);
                }
            }
        }
    }

    private static void loadDataFromUser(Scanner scanner, List<Integer> list) {
        while (true) {
            System.out.println("Podaj liczbę");
            int i = scanner.nextInt();
            if (i < 0) {
                break;
            }
            list.add(i);
        }
        System.out.println();
    }

    private static void printReversedNumberList(List<Integer> list) {
        if (!list.isEmpty()) {
            for (int i1 = list.size() - 1; i1 >= 0; i1--) {
                Integer integer = list.get(i1);
                System.out.print(integer);
                if (i1 > 0) {
                    System.out.print(", ");
                }

            }

        }
        System.out.println();
    }
}

