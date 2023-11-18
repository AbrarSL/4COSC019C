import java.util.*;

public class Main {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> simpleLinked = genTestLinkedList();
        simpleLinked.traverse();
        simpleLinked.addAfter(5, 4);
        simpleLinked.traverse();
        simpleLinked.deleteAfter(5);
        simpleLinked.deleteAfter(5);
        simpleLinked.traverse();
    }

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return INPUT.nextLine();
    }

    public static LinkedList<Integer> genTestLinkedList() {
        int[] testArray = {2, 3, 4, 6, 7, 8, 9};
        LinkedList<Integer> genList = new LinkedList<>(1);

        for (int num : testArray) {
            genList.add(num);
        }

        return genList;
    }

    public static void arraysAndArrayLists() {
        int[] simpleArray = {8, 4, 2, 0, 4};
        loadArray(simpleArray);

        for (int i : simpleArray) {
            System.out.printf("%d, ", i);
        }

        System.out.println();

        ArrayList<Integer> simpleList = arrayToArrayList(new int[] {-1, 3, 28, 17, 9, 30});
        listDemo(simpleList);

        System.out.println(simpleList);
    }

    public static void booksTest() {
        ArrayList<Book> books = new ArrayList<>();

        while (getInput("Do you want to add a book? ").equalsIgnoreCase("Y")) {
            books.add(
                    new Book(
                            getInput("Enter book title: "),
                            Integer.parseInt(getInput("Enter book published year: ")),
                            getInput("Enter book author's name: ")
                    )
            );
        }

        Collections.sort(books);
        System.out.println(books);

        HashMap<Book, Integer> shelves = new HashMap<>();

        for (Book book : books) {
            int shelfNumber = Integer.parseInt(
                    getInput("Enter shelf number for book '" + book.getTitle() + "': "));

            shelves.put(book, shelfNumber);
        }

        int shelfNumber = Integer.parseInt(getInput("Enter shelf number to check: "));
        Iterator shelfIterator = shelves.entrySet().iterator();

        while (shelfIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) shelfIterator.next();

            if (shelfNumber == (int) entry.getValue())
                System.out.println(((Book) entry.getKey()).getTitle());
        }
    }

    public static void queueTest() {
        Queue<String> newQueue = new Queue<>(5);
        newQueue.enQueue("a");
        newQueue.enQueue("b");
        newQueue.enQueue("c");
        newQueue.enQueue("e");
        newQueue.enQueue("f");
        System.out.println(newQueue);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue);
    }

    public static ArrayList<Integer> arrayToArrayList(int[] list) {
        ArrayList<Integer> outList = new ArrayList<>(list.length);

        for (int i : list) {
            outList.add(i);
        }

        return outList;
    }

    public static void loadArray(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
        }
    }

    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.remove(i);
            list.add(0, element + 1);
        }
    }
}