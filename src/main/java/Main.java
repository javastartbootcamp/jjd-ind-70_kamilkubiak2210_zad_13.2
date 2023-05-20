import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> list = new LinkedList<>();
        List<Integer> reversedList = new LinkedList<>();
        int i;
        do {
            System.out.println("Podaj liczbę");
            i = scanner.nextInt();
            list.add(i);
        } while (i > -1);
        Integer lastIntInList = list.get(list.size() - 1);
        list.remove(lastIntInList);

        System.out.println();

        int index = 1;
        if (!list.isEmpty()) {
            for (int i1 = 0; i1 < list.size(); i1++) {
                Integer integer = list.get(list.size() - index);
                index++;
                reversedList.add(integer);
            }
            for (int i1 = 0; i1 < reversedList.size(); i1++) {
                Integer integer = reversedList.get(i1);
                System.out.print(integer);
                if (i1 < reversedList.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        if (!list.isEmpty()) {
            int addResult = 0;
            for (int i1 = 0; i1 < list.size(); i1++) {
                Integer integer = list.get(i1);
                addResult += integer;
                System.out.print(integer);
                if (i1 < reversedList.size() - 1) {
                    System.out.print(" + ");
                } else if (i1 == reversedList.size() - 1) {
                    System.out.println(" = " + addResult);
                }
            }
        }
        if (!list.isEmpty()) {
            int theSmallestNumber = 10000_00000;
            int theBiggestNumber = 0;
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
}

