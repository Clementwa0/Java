import java.util.*;

public class DataStructure {
    public static void main(String[] args) {

        // ---------- ArrayList ----------
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Audi");

        // Sort in ascending order (alphabetical)
        Collections.sort(cars);
        System.out.println("Sorted ArrayList: " + cars);

        // Reverse the list
        Collections.reverse(cars);
        System.out.println("Reversed ArrayList: " + cars);

        // Shuffle (randomize)
        Collections.shuffle(cars);
        System.out.println("Shuffled ArrayList: " + cars);

        // Find max & min (lexicographically)
        System.out.println("Max (alphabetically): " + Collections.max(cars));
        System.out.println("Min (alphabetically): " + Collections.min(cars));

        // Remove one element
        cars.remove("Volvo");
        System.out.println("After removing 'Volvo': " + cars);
        System.out.println("Size of ArrayList: " + cars.size());
        System.out.println("Element at index 0: " + cars.get(0));


        // ---------- LinkedList ----------
        System.out.println("\nLinkedList:");
        LinkedList<String> books = new LinkedList<>();
        books.add("Text Books");
        books.add("Unknown Books");
        books.addFirst("Novels");
        books.addLast("StoryBooks");
        System.out.println("LinkedList Elements: " + books);

        // Sorting LinkedList
        Collections.sort(books);
        System.out.println("Sorted LinkedList: " + books);


        // ---------- HashSet ----------
        HashSet<String> animals = new HashSet<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        animals.add("Elephant");

        System.out.println("\nOriginal HashSet: " + animals);
        System.out.println("Check if set contains 'Cat': " + animals.contains("Cat"));

        // Convert to ArrayList to sort or find max/min
        ArrayList<String> sortedAnimals = new ArrayList<>(animals);
        Collections.sort(sortedAnimals);
        System.out.println("Sorted animals: " + sortedAnimals);
        System.out.println("Max animal: " + Collections.max(sortedAnimals));
        System.out.println("Min animal: " + Collections.min(sortedAnimals));

        // Remove an element using iterator
        Iterator<String> removeIt = animals.iterator();
        while (removeIt.hasNext()) {
            String animal = removeIt.next();
            if (animal.equals("Dog")) {
                removeIt.remove();
            }
        }
        System.out.println("After removing 'Dog': " + animals);


        // ---------- HashMap ----------
        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 24);
        people.put("Mary", 30);
        people.put("Peter", 27);
        people.put("Lucy", 22);

        System.out.println("\nHashMap (People & Ages): " + people);

        // Find max & min ages
        int maxAge = Collections.max(people.values());
        int minAge = Collections.min(people.values());
        System.out.println("Oldest person’s age: " + maxAge);
        System.out.println("Youngest person’s age: " + minAge);

        // Sort HashMap by key (name)
        TreeMap<String, Integer> sortedByName = new TreeMap<>(people);
        System.out.println("People sorted by name: " + sortedByName);

        // Sort HashMap by value (age)
        List<Map.Entry<String, Integer>> sortedByAge = new ArrayList<>(people.entrySet());
        sortedByAge.sort(Map.Entry.comparingByValue());
        System.out.println("People sorted by age: " + sortedByAge);
    }
}
